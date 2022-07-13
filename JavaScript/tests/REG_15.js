/* const { Builder, Browser, By, Key } = require('selenium-webdriver'); */
const { Builder, Browser, By, Key, until } = require("selenium-webdriver");

async function pruebaReg15() {

    // Ejecutamos el navegador
    let driver = await new Builder().forBrowser(Browser.CHROME).build();

    // Navegamos hasta el sitio web.
    await driver.get("https://www.pricesmart.com/site/cr/es/pagina-producto/382838");

    //
    await driver.findElement(By.id("customValue")).sendKeys(300000, Key.TAB);

    await driver.findElement(By.id("club-location-picker-modal")).click();

    await driver.wait(until.elementLocated(By.id("select-club")), 30000).then(async () => { await driver.executeScript(`document.getElementById("select-club").click()`) });

};

pruebaReg15();



