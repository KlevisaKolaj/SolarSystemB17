package SolarSystem;

public class main {
    public static void main(String[] args) {
        solarSystemBasics solarsys= new solarSystemBasics();
        solarsys.Sun="1";
        solarsys.Moon="2";
        solarsys.Planets="2";
        solarsys.Stars="10";


//**********FEATURE SUN*****************
        FeatureSun Sun = new FeatureSun();
        Sun.name="panther";
        Sun.color="black";
        Sun.temp="1223124kelvin";



 //**************PLANET 2****************
        Planet2 xaros = new Planet2();
        xaros.name = "olaola";
        xaros.color="blue";
        xaros.size="321456879";

//PLANET1
Planet1 plato = new Planet1();
plato.color="green";
plato.name="loveyou";
plato.temp="1000000k";
plato.radius="800000km";


        
    }
}
