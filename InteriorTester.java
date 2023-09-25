class InteriorTester{
public static void main(String inter[]){

Interior mat = new Interior();
mat.addMaterials("Paint");
mat.addMaterials("Door handle");
mat.addMaterials("Tiles");
mat.addMaterials("Wooden Sheets");
mat.addMaterials("Door handle");
mat.addMaterials("Wall Art");
mat.addMaterials("Glass");
mat.addMaterials("Textile");
mat.addMaterials("Playwood");
mat.addMaterials("Metal");
mat.addMaterials("Hardboard");
mat.addMaterials("CardBoard");
mat.getMaterials();
mat.deleteMaterial("Tiles");


}

}