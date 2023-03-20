package test;


import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testcase02 {
    @Test
    public static void testcase02() {
        //1. Init web-driver session
        WebDriver driver = driverFactory.EdgeDriver();
        try{
//            Test Steps:
//      Bước 1. Truy cập https://mohinhgiaxuong.com/
        driver.get("https://mohinhgiaxuong.com/");
//            driver.quit();
//      Bước 2. Bấm vào -> tất cả sản phẩm
        WebElement sanpham = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]/span[1]"));
        sanpham.click();
//      Bước 3. Trong danh sách tất cả sản phẩm, đọc chi phí của Sp Sỉ thùng / số lượng 30 - figure Demon Slayer Quỷ Kibutsuji Muzan - Kimetsu No Yaiba (là 720.000₫)
 WebElement priceElem = driver.findElement(By.xpath("//div[contains(@class,'row content-col')]//div[1]//div[1]//form[1]//div[2]//div[1]//div[1]//span[1]"));
        String price = priceElem.getText();
        System.out.println(price);
//      Bước 4. Bấm vào Sp Sỉ thùng / số lượng 30 - figure Demon Slayer Quỷ Kibutsuji Muzan - Kimetsu No Yaiba (là 720.000₫)
        WebElement linkElem = driver.findElement(By.xpath("//div[contains(@class,'row content-col')]//div[1]//div[1]//form[1]//div[1]//a[1]//img[1]"));
        linkElem.click();
//      Bước 5. Đọc chi tiết của Sp Sỉ thùng / số lượng 30 - figure Demon Slayer Quỷ Kibutsuji Muzan - Kimetsu No Yaiba (là 720.000₫)
        WebElement name = driver.findElement(By.xpath("//h1[@class='title-product']"));
        WebElement decription = driver.findElement(By.xpath("//section[contains(@class,'product details-main')]//p[1]"));
        System.out.println("Name: "+ name.getText() + ", price: " + price);

       System.out.println("Deciption: "+ decription.getText());
//      bước 6. So sánh Giá trị sản phẩm trong danh sách và trang chi tiết phải bằng nhau (720.000₫).
            WebElement priceDetail = driver.findElement(By.cssSelector(".price"));
            Assert.assertEquals(priceDetail.getText(), price);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}