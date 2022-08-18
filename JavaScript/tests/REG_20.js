/* const { Builder, Browser, By, Key } = require('selenium-webdriver'); */
const { Builder, Browser, By } = require("selenium-webdriver");

(async function pruebaReg20() {
  // Ejecutamos el navegador
  // Ejecutamos el navegador
  let driver = await new Builder().forBrowser(Browser.CHROME).build();
  await driver.manage().window().maximize();
  await driver.get("https://pricesmart.com/site/cr/es/categorias");

  setTimeout(async () => {
    await driver.executeScript(
      `document.querySelector("#marketplaceCategories > div > div:nth-child(4) > div > div > div > div > div:nth-child(3) > a").click()`
    );
  }, 1000);

  setTimeout(async () => {
    await driver.close();
  }, 2000);
})();
