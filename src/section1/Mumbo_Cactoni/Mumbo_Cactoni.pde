
PImage mumbo; 
PImage cactus;
void setup() {
  size(600,600);
cactus=loadImage("String.png");
cactus.resize(600,600); 
mumbo=loadImage("tash.png"); 
mumbo.resize(400,400);
}

void draw() {
background(cactus);


fill(000000);
ellipse(150,150,100,100); 

ellipse(420,180,100,100);

if(mouseButton==RIGHT) {
  image(mumbo,110,300);
}

}
