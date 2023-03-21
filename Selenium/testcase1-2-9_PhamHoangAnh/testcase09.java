package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testcase09 {
    @Test
    public static void testcase09() {
        //1. Init web-driver session
        WebDriver driver = driverFactory.EdgeDriver();
        try {
//            Test Steps:
//      Bước 1. Truy cập https://mohinhgiaxuong.com/
            driver.get("https://mohinhgiaxuong.com/");
//            driver.quit();
//      Bước 2. Bấm vào -> tất cả sản phẩm
            WebElement sanpham = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]/span[1]"));
            sanpham.click();
//      Bước 3. Bấm vào Sp Sỉ thùng / số lượng 30 - figure Demon Slayer Quỷ Kibutsuji Muzan - Kimetsu No Yaiba (là 720.000₫)
            WebElement linkElem = driver.findElement(By.xpath("//div[contains(@class,'row content-col')]//div[1]//div[1]//form[1]//div[1]//a[1]//img[1]"));
            linkElem.click();
        //Bước 3.1 Bấm vào Mua ngay
        WebElement muangay = driver.findElement(By.xpath("//span[normalize-space()='Mua ngay']"));
            muangay.click();

        //Bước 4. check mã giảm giá hợp lệ hay không
            WebElement magiamgia = driver.findElement(By.cssSelector("#reductionCode"));
            magiamgia.sendKeys("320203");
            WebElement apdung = driver.findElement(By.cssSelector("button[type='button'] span[class='spinner-label']"));
            apdung.click();
            Thread.sleep(3000);
        //Bước 4.1 so sánh kết quả
WebElement ketqua = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[1]/aside[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]"));
            Assert.assertEquals(ketqua.getText(), ("Mã khuyến mãi không hợp lệ"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
