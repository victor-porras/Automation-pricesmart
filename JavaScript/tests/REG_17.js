/* const { Builder, Browser, By, Key } = require('selenium-webdriver'); */
const { Builder, Browser, By } = require("selenium-webdriver");

(async function pruebaReg17() {
  // Ejecutamos el navegador
  let driver = await new Builder().forBrowser(Browser.CHROME).build();

  await driver.get("https://www.pricesmart.com/site/cr/es/iniciar-sesion");

  await driver.findElement(By.id("username")).sendKeys(117260915);

  await driver.findElement(By.id("marketplace-login-btn")).click();
})();
