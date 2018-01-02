PImage mustache;
PImage coraline;
void setup(){
  coraline = loadImage("coraline.jpg");
  size(800,600);
  coraline.resize(width,height);
  background(coraline);
  mustache = loadImage ("mustache.png");
 }
void draw(){
  image(mustache,250,240);
}