package test;

import driver.driverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

@Test
public class testcase08 {
    public static void testcase08() {
        //1. Init web-driver session
        WebDriver driver = driverFactory.EdgeDriver();
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            //step 1: truy cập trang web
            driver.get("https://mohinhgiaxuong.com/");
            //step 2: nhấp vào tài khoản
            WebElement taikhoan = driver.findElement(By.xpath("//div[contains(@class,'col-3 col-xl-5 col-lg-5')]//a[@title='Tài khoản'][contains(text(),'Tài khoản')]"));
            taikhoan.click();
            // Step 3: Đăng nhập vào ứng dụng bằng thông tin xác thực đã tạo trước đó
            // nhập tài khoản
            WebElement emailInput = driver.findElement(By.xpath("//input[@id='customer_email']"));
            emailInput.sendKeys("thinhle@gmail.com");
            // nhập mật khẩu
            WebElement passwordInput = driver.findElement(By.xpath("//input[@id='customer_password']"));
            passwordInput.sendKeys("123456");
            // click đăng nhập
            WebElement loginButton = driver.findElement(By.xpath("//button[@value='Đăng nhập']"));
            loginButton.click();

            // thêm sp
            WebElement danhmucsp = driver.findElement(By.xpath("//div[@class='toogle-nav-wrapper \t']"));
            danhmucsp.click();

            WebElement tatcasp = driver.findElement(By.xpath("//div[@class='toogle-nav-wrapper \t']//span[contains(text(),'Tất Cả Sản Phẩm')]"));
            tatcasp.click();

            WebElement click = driver.findElement(By.xpath("//div[1]//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]//div[1]//form[1]//div[1]//a[1]//img[1]"));
            click.click();
            WebElement themvaogiohang = driver.findElement(By.xpath("//div[contains(@class,'form_product_content type1')]//span[contains(@class,'text_1')][contains(text(),'Thêm vào giỏ')]"));
            themvaogiohang.click();
            themvaogiohang.click();
            themvaogiohang.click();
            Thread.sleep(1000);
            // Step 4: Nhấp vào liên kết 'GIỎ HÀNG', thay đổi SỐ LƯỢNG & nhấp vào Cập nhật
            WebElement xemgiohang = driver.findElement(By.xpath("//a[@class='btn btn-main checkout_button btn-full']"));
            xemgiohang.click();


            WebElement soluong = driver.findElement(By.xpath("//button[@class='increase items-count btn-plus btn']//*[name()='svg']"));
            soluong.click();Thread.sleep(1000);
            soluong.click();Thread.sleep(1000);
            soluong.click();Thread.sleep(1000);
            soluong.click();Thread.sleep(1000);
            String beforeTotal = soluong.getText();
            Thread.sleep(1000);

            // Step 5: Xác minh rằng Tổng số tiền đã thay đổi
            WebElement total2 = driver.findElement(By.xpath("//div[@class='title-cart d-none d-sm-flex ']"));
            String afterTotal = total2.getText();
            Assert.assertNotEquals(beforeTotal, afterTotal);
            Thread.sleep(1000);
            // Step 6:  Hoàn thành thông tin thanh toán và giao hàng
            // thanh toán
            WebElement thanhtoan = driver.findElement(By.xpath("//button[contains(@title,'Tiến hành thanh toán')]"));
            thanhtoan.click();
            Thread.sleep(1000);
            // Step 7:Xác minh đơn đặt hàng được tạo và lưu ý số đơn đặt hàng
            TakesScreenshot screenshot = ((TakesScreenshot) driver);
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("D:\\HK5\\CNKT\\selenium-cuoiky\\src\\test\\java\\test\\tc8.png");
            FileHandler.copy(srcFile, destFile);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
