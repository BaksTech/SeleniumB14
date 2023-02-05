package ActionClass;

import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class ActionMethods {
    //ContextClick(right click

    @Test
    public void ActiontextClick(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //driver.get("https://the-internet.herokuapp.com/");

//        WebElement conTextMenu=driver.findElement(By.linkText("Context Menu"));
//        conTextMenu.click();
//        WebElement box= driver.findElement(By.id("hot-spot"));
        Actions action=new Actions(driver);
        //action.contextClick(box).perform();

        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        WebElement click= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        action.contextClick(click).perform();


    }
    //DoubleClick
    @Test
    public void DoubleClick(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        WebElement doubleClick= driver.findElement(By.xpath("//button"));

        Actions actions=new Actions(driver);

        actions.doubleClick(doubleClick).perform();



    }

}
