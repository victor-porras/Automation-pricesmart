/* const { Builder, Browser, By, Key } = require('selenium-webdriver'); */
const { Builder, Browser, By } = require("selenium-webdriver");

(async function pruebaReg16() {
  // Ejecutamos el navegador
  let driver = await new Builder().forBrowser(Browser.CHROME).build();

  //Se navega a la direccion del producto.
  await driver.get(
    "https://www.pricesmart.com/site/cr/es/pagina-producto/423554"
  );
  //Buscamos el elemento que agrega el producto al carrito
  await driver.findElement(By.id("btn-add-to-cart")).click();

  // Buscamos el elemento que aumenta 1 a la cantidad de producto y se le da click. Se deberia actualizar la informacion de cantidad a pagar
  await driver
    .findElement(
      By.xpath(
        "/html/body/section/section/div/div/div[2]/div[1]/div/div/div/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/form/div/div[2]/button"
      )
    )
    .click();
  // Buscamos el elemento que resta 1 a la cantidad de producto y se le da click. Se deberia actualizar la informacion de cantidad a pagar.
  await driver
    .findElement(
      By.xpath(
        "/html/body/section/section/div/div/div[2]/div[1]/div/div/div/div[1]/div/div[3]/div[1]/div[2]/div/div[1]/form/div/div[1]/button"
      )
    )
    .click();
})();
