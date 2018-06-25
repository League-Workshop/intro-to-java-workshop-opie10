PImage rainbow;
PImage unicorn ;
void setup () {  
  rainbow = loadImage("bowrain.png");
  size (1920,1080 );
  rainbow.resize(1920,1080);

  unicorn =loadImage("cornuni.png");
}  
void draw () {

  background (rainbow); 
  image(unicorn, mouseX, mouseY);
}