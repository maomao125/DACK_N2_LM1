package test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;



public class testcase01 {
    @Test
    public static void testcase1(){
        WebDriver driver = driverFactory.EdgeDriver();
        try{

//        Bước 1. Truy cập https://mohinhgiaxuong.com/
            driver.get("https://mohinhgiaxuong.com/");
//            driver.quit();
//        Bước 2. Bấm vào -> tất cả sản phẩm
            WebElement sanpham = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]/span[1]"));
            sanpham.click();
//        Bước 3. Tại danh sách sản phẩm => a-z
            WebElement sapXepAZ = driver.findElement(By.cssSelector("a[onclick=\"sortby('alpha-asc')\"]"));
            sapXepAZ.click();
            Thread.sleep(1000);
//        Bước 4. Xác minh tất cả các sản phẩm được sắp xếp theo tên
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
            File DestFile = new File("D:\\phanmemhoctap\\kiemthuUD\\selenium-webdriver-java-main - thi\\testcase1.png");
            FileHandler.copy(SrcFile, DestFile); // Chuyển file image từ SrcFile sang DestFile

        }catch(Exception e){
            e.printStackTrace();
        }


    }
}