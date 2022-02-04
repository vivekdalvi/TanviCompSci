
public class BoxCorners
{
    int [] xcorners ={0,0,0,0};
    int [] ycorners ={0,0,0,0};

    public BoxCorners( Box b)
    {
        xcorners[0] = b.getX();
        ycorners[0] = b.getY();

        xcorners[1] = b.getX();
        ycorners[1] = b.getY() + b.getHeight();

        xcorners[2] = b.getX() + b.getWidth();
        ycorners[2] = b.getY() + b.getHeight();

        xcorners[3] = b.getX() + b.getWidth();
        ycorners[3] = b.getY();
    }

    //accessor
    public int[] GetXcorners()
    {
        return xcorners;
    }

    public int[] GetYcorners()
    {
        return ycorners;
    }


}