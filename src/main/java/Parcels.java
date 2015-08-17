public class Parcels{
  private Integer mHeight;
  private Integer mLength;
  private Integer mWidth;

  public Parcels(Integer height, Integer length, Integer width){
    mLength = length;
    mWidth = width;
    mHeight = height;
  }

  public int getHeight() {
    return mHeight;
  }

  public int getLength() {
    return mLength;
  }

  public int getWidth() {
    return mWidth;
  }

  public int volume(){
    int calculation = mHeight * mLength * mWidth;
    return calculation;
  }

}
