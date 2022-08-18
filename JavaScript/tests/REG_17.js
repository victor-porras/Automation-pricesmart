const datosLogin = ["user", "password"];

const { Builder, Browser, By, until } = require("selenium-webdriver");

(async function pruebaReg17() {
  // Ejecutamos el navegador
  let driver = await new Builder().forBrowser(Browser.CHROME).build();
  await driver.manage().window().maximize();
  await driver.get("https://www.pricesmart.com/site/cr/es/iniciar-sesion");

  await driver.findElement(By.id("username")).sendKeys(datosLogin[0]);
  await driver.findElement(By.id("marketplace-login-btn")).click();
  await driver
    .wait(until.elementLocated(By.id("password")), 30000)
    .then(async () => {
      await driver.findElement(By.id("password")).sendKeys(datosLogin[1]);
    });

  await driver
    .wait(until.elementLocated(By.id("kc-login")), 30000)
    .then(async () => {
      await driver.findElement(By.id("kc-login")).click();
    });

  await driver
    .wait(until.elementLocated(By.id("continue-shopping-link")), 30000)
    .then(async () => {
      await driver.findElement(By.className("continue-shopping-link")).click();
    });

  setTimeout(async () => {
    await driver.close();
  }, 1500);
})();
