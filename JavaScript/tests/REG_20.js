/* const { Builder, Browser, By, Key } = require('selenium-webdriver'); */
const { Builder, Browser, By } = require("selenium-webdriver");

(async function pruebaReg20() {
  // Ejecutamos el navegador
  // Ejecutamos el navegador
  let driver = await new Builder().forBrowser(Browser.CHROME).build();

  await driver.get("https://www.pricesmart.com/site/hn/es");

  await driver.executeScript("window.scrollBy(0,document.body.scrollHeight)");

  setTimeout(async () => {
    await driver.executeScript(
      `document.querySelector("#footer > footer > div > div.row.py-4 > div > div > a > button").click()`
    );
  }, 1000);

  setTimeout(async () => {
    await driver.executeScript(
      `document.querySelector("#country-picker-home > div > div:nth-child(5) > div > div > div:nth-child(1) > div > ul > li:nth-child(2) > a").click()`
    );
  }, 1000);

  setTimeout(async () => {
    await driver.executeScript("window.scrollBy(0,document.body.scrollHeight)");
  }, 1000);
})();
