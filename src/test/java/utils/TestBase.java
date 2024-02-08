package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/global.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser").toLowerCase();
		String url = prop.getProperty("url");
		if (driver == null) {
			switch (browser) {
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "fireFox":
				driver = new FirefoxDriver();
				break;
			case "Edge":
				driver = new EdgeDriver();
				break;
			}
			driver.get(url);
		}

		return driver;
	}
}
