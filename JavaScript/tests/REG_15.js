/* const { Builder, Browser, By, Key } = require('selenium-webdriver'); */
const { Builder, Browser, By, Key, until } = require("selenium-webdriver");

async function example() {

    //launch the browser
    let driver = await new Builder().forBrowser(Browser.CHROME).build();

    //navigate to our application
    await driver.get("https://www.pricesmart.com/site/cr/es/pagina-producto/382838");

    await driver.findElement(By.id("customValue")).sendKeys(300000, Key.TAB);

    let x = await driver.findElement(By.id("club-location-picker-modal")).click();

    // await driver.findElements(By.className("club-selection-button-make")).then((botones) => {

    //     //valor aleatorio entre 0  y 1
    //     let aleatorio = Math.random();
    //     //Multiplica la cantidad de elementos por valor
    //     aleatorio = Math.floor(aleatorio * botones.length);
    //     console.log(botones[aleatorio]);
    //     botones[aleatorio].click();
    // });

    const resultadosDeSugerencia = await driver.wait(until.elementsLocated(By.className("club-selection-button-make")));
    const resultado = await driver.findElements(By.className("club-selection-button-make"));

    console.log(resultado);
    resultado[1].click();

    // let boton = await driver.findElement(By.id("select-club"));
    //await driver.findElement(By.id("sampletodotext")).sendKeys("Learn Selenium", Key.RETURN);
    // await driver.findElement(By.id("link-change-club")).sendKeys(Key.ENTER);
    //close the browser


};



example();

function getElementoAleatorio(arreglo) {
    //valor aleatorio entre 0  y 1

    let aleatorio = Math.random();
    //Multiplica la cantidad de elementos por valor
    aleatorio = Math.floor(aleatorio * arreglo.length);

    return arreglo[aleatorio];

}



