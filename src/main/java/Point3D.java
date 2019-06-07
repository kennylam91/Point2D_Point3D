public class Point3D extends Point2D {
    private float z;
    Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        setZ(z);
    }

    public float[] getXYZ(){
        float[] array={getX(),getY(),getZ()};
        return array;
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+","+getZ()+")";
    }
}
