public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3d=new Point3D(1,2,3);
        System.out.println(point3d.toString());
        for(int i=0;i<point3d.getXYZ().length;i++){
            System.out.println(point3d.getXYZ()[i]);
        }
    }
}
