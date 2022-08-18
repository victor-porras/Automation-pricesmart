/* const { Builder, Browser, By, Key } = require('selenium-webdriver'); */
const { Builder, Browser, By } = require("selenium-webdriver");

(async function pruebaReg18() {
  // Ejecutamos el navegador
  let driver = await new Builder().forBrowser(Browser.CHROME).build();
  await driver.manage().window().maximize();
  await driver.get("https://www.pricesmart.com/site/cr/es");

  await driver.executeScript("window.scrollBy(0,document.body.scrollHeight)");

  setTimeout(async () => {
    await driver.executeScript(
      `document.querySelector("#inventory-language-selector > ul > li:nth-child(2) > a").click()`
    );
  }, 1000);
  setTimeout(async () => {
    await driver.close();
  }, 1500);
})();
