package com.rbtboy.api;

import java.awt.Point;

public abstract interface IBase
{
  public abstract void DO(String paramString)
    throws Exception;
  
  public abstract void WAIT(int paramInt)
    throws Exception;
  
  public abstract void WAIT(String paramString)
    throws Exception;
  
  public abstract void WAIT(String paramString, int paramInt)
    throws Exception;
  
  public abstract void WAIT(String paramString1, String paramString2)
    throws Exception;
  
  public abstract void WAIT_IMG(String paramString)
    throws Exception;
  
  public abstract boolean WAIT_IMG(String paramString, int paramInt)
    throws Exception;
  
  public abstract void WAIT_NIMG(String paramString)
    throws Exception;
  
  public abstract boolean WAIT_NIMG(String paramString, int paramInt)
    throws Exception;
  
  public abstract void SHOW(int paramInt)
    throws Exception;
  
  public abstract void SHOW(String paramString)
    throws Exception;
  
  public abstract void SHOW(String paramString, int paramInt)
    throws Exception;
  
  public abstract void SHOW(String paramString1, String paramString2)
    throws Exception;
  
  public abstract String INPUT(String paramString)
    throws Exception;
  
  public abstract String INPUT(String paramString, int paramInt)
    throws Exception;
  
  public abstract String INPUT(String paramString1, int paramInt, String paramString2)
    throws Exception;
  
  public abstract String INPUT(String paramString1, String paramString2)
    throws Exception;
  
  public abstract String INPUT(String paramString1, String paramString2, String paramString3)
    throws Exception;
  
  public abstract String INPUT_STR(String paramString)
    throws Exception;
  
  public abstract String INPUT_STR(String paramString, int paramInt)
    throws Exception;
  
  public abstract String INPUT_STR(String paramString1, int paramInt, String paramString2)
    throws Exception;
  
  public abstract String INPUT_STR(String paramString1, String paramString2)
    throws Exception;
  
  public abstract String INPUT_STR(String paramString1, String paramString2, String paramString3)
    throws Exception;
  
  public abstract int INPUT_INT(String paramString)
    throws Exception;
  
  public abstract int INPUT_INT(String paramString, int paramInt)
    throws Exception;
  
  public abstract int INPUT_INT(String paramString, int paramInt1, int paramInt2)
    throws Exception;
  
  public abstract int INPUT_INT(String paramString1, String paramString2)
    throws Exception;
  
  public abstract int INPUT_INT(String paramString1, String paramString2, int paramInt)
    throws Exception;
  
  public abstract float INPUT_DEC(String paramString)
    throws Exception;
  
  public abstract float INPUT_DEC(String paramString, int paramInt)
    throws Exception;
  
  public abstract float INPUT_DEC(String paramString, int paramInt, float paramFloat)
    throws Exception;
  
  public abstract float INPUT_DEC(String paramString1, String paramString2)
    throws Exception;
  
  public abstract float INPUT_DEC(String paramString1, String paramString2, float paramFloat)
    throws Exception;
  
  public abstract String INPUT_PWD(String paramString)
    throws Exception;
  
  public abstract String INPUT_PWD(String paramString, int paramInt)
    throws Exception;
  
  public abstract String INPUT_PWD(String paramString1, String paramString2)
    throws Exception;
  
  public abstract boolean ANSWER(String paramString)
    throws Exception;
  
  public abstract boolean ANSWER(String paramString1, int paramInt, String paramString2)
    throws Exception;
  
  public abstract boolean ANSWER(String paramString1, String paramString2, String paramString3)
    throws Exception;
  
  public abstract void WAITS(int paramInt)
    throws Exception;
  
  public abstract void CLICK()
    throws Exception;
  
  public abstract void MOUSEDOWN()
    throws Exception;
  
  public abstract void MOUSEUP()
    throws Exception;
  
  public abstract void MOUSEDOWNR()
    throws Exception;
  
  public abstract void MOUSEUPR()
    throws Exception;
  
  public abstract void DCLICK()
    throws Exception;
  
  public abstract void CLICK(String paramString)
    throws Exception;
  
  public abstract boolean CLICK(String paramString, int paramInt)
    throws Exception;
  
  public abstract void CLICK(String paramString, int paramInt1, int paramInt2)
    throws Exception;
  
  public abstract boolean CLICK(String paramString, int paramInt1, int paramInt2, int paramInt3)
    throws Exception;
  
  public abstract void MOVE(int paramInt1, int paramInt2, int paramInt3)
    throws Exception;
  
  public abstract void MOVE(int paramInt1, int paramInt2)
    throws Exception;
  
  public abstract void MOVE(Point paramPoint)
    throws Exception;
  
  public abstract void MOVE(Point paramPoint, int paramInt)
    throws Exception;
  
  public abstract void MOVE(String paramString)
    throws Exception;
  
  public abstract void MOVE(String paramString, int paramInt1, int paramInt2)
    throws Exception;
  
  public abstract boolean MOVE(String paramString, int paramInt)
    throws Exception;
  
  public abstract boolean MOVE(String paramString, int paramInt1, int paramInt2, int paramInt3)
    throws Exception;
  
  public abstract Point FIND(String paramString, int paramInt1, int paramInt2)
    throws Exception;
  
  public abstract Point FIND(String paramString)
    throws Exception;
  
  public abstract void WRITE(String paramString, int paramInt)
    throws Exception;
  
  public abstract void WRITE(String paramString)
    throws Exception;
  
  public abstract void WRITEC(String paramString, int paramInt)
    throws Exception;
  
  public abstract void WRITEC(String paramString)
    throws Exception;
  
  public abstract void WRITEL()
    throws Exception;
  
  public abstract void WRITE2FILE(String paramString1, String paramString2)
    throws Exception;
  
  public abstract void WRITE2FILE(String paramString1, String paramString2, String paramString3)
    throws Exception;
  
  public abstract void WRITE2FILE(String paramString1, String paramString2, boolean paramBoolean)
    throws Exception;
  
  public abstract void WRITEPWD(String paramString)
    throws Exception;
  
  public abstract void WRITEPWD(String paramString, int paramInt)
    throws Exception;
  
  public abstract void DDD(int paramInt, String... paramVarArgs)
    throws Exception;
  
  public abstract void EEE(String[] paramArrayOfString)
    throws Exception;
  
  public abstract String[] FFF(String[] paramArrayOfString)
    throws Exception;
  
  public abstract void SCREEN2FILE(String paramString)
    throws Exception;
  
  public abstract void SCREEN2FILE(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws Exception;
  
  public abstract String DTEXT()
    throws Exception;
  
  public abstract void MOVE(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    throws Exception;
  
  public abstract int RANDOM(int paramInt1, int paramInt2)
    throws Exception;
  
  public abstract String TEXT(boolean paramBoolean)
    throws Exception;
  
  public abstract void END()
    throws Exception;
  
  public abstract void ABC()
    throws Exception;
}

