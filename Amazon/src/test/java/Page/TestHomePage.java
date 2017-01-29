package Page;

import Base.CommonApi;
import org.testng.annotations.Test;

/**
 * Created by riponctg on 1/28/2017.
 */
public class TestHomePage extends CommonApi {
    @Test
    public void testHome(){
        System.out.println(driver.getCurrentUrl());
        clickByXpath(".//*[@id='nav-xshop']/a[2]");
        clickByXpath(".//*[@id='widgetFilters']/div[1]/div/span[1]/div/label/span");
        clickByXpath(".//*[@id='nav-xshop']/a[3]");
        clickByXpath(".//*[@id='nav-orders']");
        //driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[2]")).click();
       // driver.findElement(By.xpath(".//*[@id='widgetFilters']/div[1]/div/span[1]/div/label/span")).click();
       // driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[3]")).click();
       // driver.findElement(By.xpath(".//*[@id='nav-orders']")).click();
        //driver.findElement(By.xpath(".//*[@id='magnifierLens']")).click();


    }

}
