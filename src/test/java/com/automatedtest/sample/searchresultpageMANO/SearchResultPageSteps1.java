package com.automatedtest.sample.searchresultpageMANO;

import com.automatedtest.sample.basepage.BasePage;

import com.automatedtest.sample.infrastructure.driver.Setup;
import com.automatedtest.sample.infrastructure.driver.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.Given;

public class SearchResultPageSteps1 extends BasePage{

    private SearchResultPage1 searchResultPage;

    public SearchResultPageSteps1() {
        this.searchResultPage = new SearchResultPage1();
    }

    @Given("A user navigates to HomePageManomanoUK")
    public void a_user_navigates_to_HomePageManomanoUK() {
    	driver.get("https://www.manomano.co.uk/");
        wait.forLoading(5);
        driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();

        
        
        
    }

    

    
    

    @When("a user searches for {string} and click into first suggestion")
    public void a_user_searches_for_and_click_into_first_suggestion(String string) {
    	wait.forLoading(3);
        driver.findElement(By.xpath("//*[@id=\"searchbar\"]")).sendKeys(string);
        
        
        wait.forLoading(5);
        
        

        
        		 driver.findElement(By.xpath("(//div[contains(@class,'result-text')])[1]")).click();
              wait.forLoading(5);
               
        
        
    }

    @When("a user searches for {string} and click into second suggestion")
    public void a_user_searches_for_and_click_into_second_suggestion(String string) {
    	wait.forLoading(3);
        driver.findElement(By.xpath("//*[@id=\"searchbar\"]")).sendKeys(string);
        
        
        wait.forLoading(5);
        
      
        driver.findElement(By.xpath("(//div[contains(@class,'result-text')])[2]")).click();
     wait.forLoading(5);
      
        
    }

    

    @Then("{string} is displayed in the new page")
    public void is_displayed_in_the_new_page(String string) {
         
    	
    	
    }
    

}
