public class Parcels {
  private Integer mHeight;
  private Integer mLength;
  private Integer mWidth;
  private Integer mWeight;

  public Parcels(Integer height, Integer length, Integer width) {
    mHeight = height;
    mLength = length;
    mWidth = width;
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
