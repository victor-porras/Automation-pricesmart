/* const { Builder, Browser, By, Key } = require('selenium-webdriver'); */
const { Builder, Browser, By, Key, until } = require("selenium-webdriver");

async function pruebaReg15() {
  // Ejecutamos el navegador
  let driver = await new Builder().forBrowser(Browser.CHROME).build();

  try {
    // Navegamos hasta el sitio web.
    await driver.get(
      "https://www.pricesmart.com/site/cr/es/pagina-producto/382838"
    );

    // Se busca el elemento input para colocar cantidad de producto para pasarle un valor y luego perder el foco y obtener la validación.

    await driver.findElement(By.id("customValue")).sendKeys(300000, Key.TAB);

    // Se busca el elemento que invoca el modal para seleccionar un club
    await driver.findElement(By.id("club-location-picker-modal")).click();

    // busca hasta que encuentra cualquier boton de cambiar club con un esperar explicito de 30 segundos
    // luego si lo encuentra usar el retorno de la promesa para ejecutar javascript vanilla y dar click al boton
    await driver
      .wait(until.elementLocated(By.id("select-club")), 30000)
      .then(async () => {
        await driver.executeScript(
          `document.getElementById("select-club").click()`
        );
      });

    await driver.findElement(By.id("customValue")).sendKeys(300000, Key.TAB);
    //await driver.quit();
  } catch (error) {
    console.log(error);
  }

  //finaliza el caso de prueba.
}

pruebaReg15();
