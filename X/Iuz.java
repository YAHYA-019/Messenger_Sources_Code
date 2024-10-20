package X;

import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLException;
import com.facebook.common.dextricks.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.webrtc.Logging;
import org.webrtc.VideoFrame;
import org.webrtc.YuvHelper;

/* loaded from: Iuz.class */
public final /* synthetic */ class Iuz implements Runnable {
    public static final String __redex_internal_original_name = "EglRenderer$$ExternalSyntheticLambda0";
    public final /* synthetic */ IJG A00;

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        float f2;
        float f3;
        ByteBuffer byteBuffer;
        IJG ijg = this.A00;
        synchronized (ijg.A0K) {
            VideoFrame videoFrame = ijg.A0F;
            if (videoFrame == null) {
                return;
            }
            ijg.A0F = null;
            JOR jor = ijg.A0B;
            if (jor == null || !jor.BNc()) {
                IJG.A01("Dropping frame - No surface", ijg);
            } else {
                try {
                    jor.BcD();
                    synchronized (ijg.A0J) {
                    }
                    long nanoTime = System.nanoTime();
                    float rotatedWidth = videoFrame.getRotatedWidth() / videoFrame.getRotatedHeight();
                    synchronized (ijg.A0I) {
                        f = ijg.A00;
                        if (f == 0.0f) {
                            f = rotatedWidth;
                        }
                    }
                    if (rotatedWidth > f) {
                        f3 = f / rotatedWidth;
                        f2 = 1.0f;
                    } else {
                        f2 = rotatedWidth / f;
                        f3 = 1.0f;
                    }
                    Matrix matrix = ijg.A0H;
                    matrix.reset();
                    matrix.preTranslate(0.5f, 0.5f);
                    matrix.preScale(1.0f, 1.0f);
                    matrix.preScale(f3, f2);
                    matrix.preTranslate(-0.5f, -0.5f);
                    matrix.preRotate(ijg.A07, 0.5f, 0.5f);
                    try {
                        try {
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                            GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
                            I8P i8p = ijg.A0W;
                            JLY jly = ijg.A0D;
                            int D3l = ijg.A0B.D3l();
                            int D3k = ijg.A0B.D3k();
                            int rotatedWidth2 = videoFrame.getRotatedWidth();
                            int rotatedHeight = videoFrame.getRotatedHeight();
                            float[] fArr = i8p.A05;
                            matrix.mapPoints(fArr, I8P.A07);
                            int i = 0;
                            do {
                                int i2 = i * 2;
                                fArr[i2] = fArr[i2] * rotatedWidth2;
                                int i3 = i2 + 1;
                                fArr[i3] = fArr[i3] * rotatedHeight;
                                i++;
                            } while (i < 3);
                            float f4 = fArr[0];
                            float f5 = fArr[1];
                            int A0A = AbstractC2326GOr.A0A(fArr, fArr[2], f4, f5, 3);
                            i8p.A01 = A0A;
                            int A0A2 = AbstractC2326GOr.A0A(fArr, fArr[4], f4, f5, 5);
                            i8p.A00 = A0A2;
                            if (A0A <= 0 || A0A2 <= 0) {
                                Logging.w("VideoFrameDrawer", 0Pz.A0C(A0A, A0A2, "Illegal frame size: ", "x"));
                            } else {
                                boolean z = videoFrame.buffer instanceof VideoFrame.TextureBuffer;
                                Matrix matrix2 = i8p.A03;
                                matrix2.reset();
                                matrix2.preTranslate(0.5f, 0.5f);
                                if (!z) {
                                    matrix2.preScale(1.0f, -1.0f);
                                }
                                matrix2.preRotate(videoFrame.rotation);
                                matrix2.preTranslate(-0.5f, -0.5f);
                                matrix2.preConcat(matrix);
                                if (z) {
                                    i8p.A02 = null;
                                    I8P.A00(matrix2, jly, (VideoFrame.TextureBuffer) videoFrame.buffer, i8p.A01, i8p.A00, 0, 0, D3l, D3k);
                                } else {
                                    if (videoFrame != i8p.A02) {
                                        i8p.A02 = videoFrame;
                                        VideoFrame.I420Buffer i420 = videoFrame.buffer.toI420();
                                        Hct hct = i8p.A04;
                                        int[] iArr = {i420.getStrideY(), i420.getStrideU(), i420.getStrideV()};
                                        ByteBuffer[] byteBufferArr = {i420.getDataY(), i420.getDataU(), i420.getDataV()};
                                        int width = i420.getWidth();
                                        int height = i420.getHeight();
                                        int i4 = 0;
                                        int i5 = width / 2;
                                        int[] iArr2 = {width, i5, i5};
                                        int i6 = height / 2;
                                        int[] iArr3 = {height, i6, i6};
                                        int i7 = 0;
                                        int i8 = 0;
                                        do {
                                            int i9 = iArr[i7];
                                            int i10 = iArr2[i7];
                                            if (i9 > i10) {
                                                i8 = Math.max(i8, i10 * iArr3[i7]);
                                            }
                                            i7++;
                                        } while (i7 < 3);
                                        if (i8 > 0) {
                                            ByteBuffer byteBuffer2 = hct.A00;
                                            if (byteBuffer2 == null || byteBuffer2.capacity() < i8) {
                                                hct.A00 = ByteBuffer.allocateDirect(i8);
                                            }
                                        }
                                        if (hct.A01 == null) {
                                            hct.A01 = new int[3];
                                            int i11 = 0;
                                            do {
                                                int[] iArr4 = hct.A01;
                                                int A04 = AbstractC2326GOr.A04(3553);
                                                HM3.A00("generateTexture");
                                                iArr4[i11] = A04;
                                                i11++;
                                            } while (i11 < 3);
                                        }
                                        do {
                                            GLES20.glActiveTexture(33984 + i4);
                                            GLES20.glBindTexture(3553, hct.A01[i4]);
                                            int i12 = iArr[i4];
                                            int i13 = iArr2[i4];
                                            if (i12 == i13) {
                                                byteBuffer = byteBufferArr[i4];
                                            } else {
                                                YuvHelper.nativeCopyPlane(byteBufferArr[i4], i12, hct.A00, i13, i13, iArr3[i4]);
                                                byteBuffer = hct.A00;
                                            }
                                            GLES20.glTexImage2D(3553, 0, 6409, iArr2[i4], iArr3[i4], 0, 6409, 5121, byteBuffer);
                                            i4++;
                                        } while (i4 < 3);
                                        i420.release();
                                    }
                                    jly.AOm(Hw8.A01(matrix2), i8p.A04.A01, i8p.A01, i8p.A00, 0, 0, D3l, D3k);
                                }
                            }
                            long nanoTime2 = System.nanoTime();
                            synchronized (ijg.A0N) {
                                try {
                                    if (ijg.A0C != null) {
                                        ijg.A0B.D3m();
                                        Iterator it = ijg.A0S.iterator();
                                        if (it.hasNext()) {
                                            it.next();
                                            System.nanoTime();
                                            th = AnonymousClass001.A0Q("onRender");
                                        } else {
                                            Iterator it2 = ijg.A0U.A00.iterator();
                                            while (it2.hasNext()) {
                                                it2.next();
                                                if (videoFrame instanceof JCF) {
                                                    JCF jcf = (JCF) videoFrame;
                                                    if (jcf != null) {
                                                        jcf.A00.onFrameRendered();
                                                    }
                                                }
                                            }
                                            synchronized (ijg.A0M) {
                                                try {
                                                    ijg.A08 += System.nanoTime() - nanoTime2;
                                                } catch (Throwable th) {
                                                    th = th;
                                                }
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            synchronized (ijg.A0M) {
                                try {
                                    ijg.A04++;
                                    ijg.A09 += nanoTime2 - nanoTime;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            ArrayList arrayList = ijg.A0R;
                            if (!arrayList.isEmpty()) {
                                matrix.reset();
                                matrix.preTranslate(0.5f, 0.5f);
                                matrix.preScale(1.0f, 1.0f);
                                matrix.preScale(1.0f, -1.0f);
                                matrix.preTranslate(-0.5f, -0.5f);
                                Iterator it3 = arrayList.iterator();
                                if (it3.hasNext()) {
                                    it3.next();
                                    it3.remove();
                                    th = AnonymousClass001.A0Q("scale");
                                    throw th;
                                }
                            }
                        } finally {
                            videoFrame.release();
                        }
                    } catch (J71 e) {
                        IJG.A00("Error while drawing frame", e, ijg);
                        ijg.A0D.release();
                        ijg.A0W.A01();
                        ijg.A0V.A00();
                    }
                } catch (GLException e2) {
                    IJG.A00("Error while eglMakeCurrent", e2, ijg);
                    videoFrame.release();
                }
            }
        }
    }
}
