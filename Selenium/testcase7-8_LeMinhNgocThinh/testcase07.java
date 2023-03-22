package test;

import driver.driverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
@Test
public class testcase07 {
    public static void testcase07() {
        //1.
        //Khởi tạo phiên trình điều khiển web
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

            WebElement xemgiohang = driver.findElement(By.xpath("//a[@class='btn btn-main checkout_button btn-full']"));
            xemgiohang.click();

            WebElement taikhoann = driver.findElement(By.xpath("//div[contains(@class,'col-3 col-xl-5 col-lg-5')]//a[@title='Tài khoản'][contains(text(),'Tài khoản')]"));
            taikhoann.click();
            // Step 4: Nhấp vào 'Đơn đặt hàng của tôi'
            WebElement donhang = driver.findElement(By.xpath("//a[contains(text(),'Đơn hàng của bạn')]"));
            donhang.click();
            Thread.sleep(3000);
            // Step 5: Nhấp vào 'Xem đơn hàng' đơn hàng khi click vào mua thì sẽ được thêm vào giỏ hàng
            WebElement giohang = driver.findElement(By.xpath("//div[contains(@class,'col-3 col-xl-5 col-lg-5')]//img[@alt='cart_icon']"));
            giohang.click();
            // skip step 678: vì không thanh toán
            // Step 6:lưu ý: Sau bước 4 và 5, bước 6 "ĐƠN HÀNG GẦN ĐÂY" không hiển thị
            //   Xác minh rằng đơn đặt hàng đã tạo trước đó được hiển thị trong bảng 'ĐƠN HÀNG GẦN ĐÂY' và trạng thái là Đang chờ xử lý
            // Step 7: Nhấp vào liên kết 'Đặt hàng và in phiếu'
            // Step 8: *** lưu ý: không tìm thấy liên kết.
            // Nhấp vào liên kết 'Thay đổi...' và một cửa sổ bật lên sẽ được mở dưới dạng 'Chọn điểm đến' , chọn liên kết 'Lưu dưới dạng PDF'
            // chụp hình lại
            TakesScreenshot screenshot = ((TakesScreenshot) driver);
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("D:\\HK5\\CNKT\\selenium-cuoiky\\src\\test\\java\\test\\thanhtoan.png");
            FileHandler.copy(srcFile, destFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}