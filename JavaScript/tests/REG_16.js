/* const { Builder, Browser, By, Key } = require('selenium-webdriver'); */
const { Builder, Browser, By, Key, until } = require("selenium-webdriver");

(async function pruebaReg15() {
    // Ejecutamos el navegador
    let driver = await new Builder().forBrowser(Browser.CHROME).build();

    try {

        await driver.get("https://www.pricesmart.com/site/cr/es/pagina-producto/382838");

        let tituloDeLaPagina = await driver.getTitle();

        let tituloPagina

        //finaliza el caso de prueba.
    } catch (error) {
        console.log("Existio un error", error);
    } finally {
        console.log("Debido al error se cerrara automaticamente el navegador");
        await driver.quit();
    }


})();
