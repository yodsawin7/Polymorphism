public class App{
public static void main (String[] args )throws Exception {
Cow ngna = new Cow();
Duck donald = new Duck();
Pig piglet = new Pig();
Owl hedwig = new Owl();
Duck daisy = new Duck();
donald.clean(ngna);
donald.clean(piglet);
donald.clean(hedwig);
donald.clean(daisy);
daisy.clean(donald);
}
}