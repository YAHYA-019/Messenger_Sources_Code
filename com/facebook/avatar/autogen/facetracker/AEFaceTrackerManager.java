package com.facebook.avatar.autogen.facetracker;

import X.0fH;
import X.11T;
import X.2aG;
import X.2aN;
import X.7zO;
import X.C0il;
import X.HBF;
import X.HGO;
import X.HGP;
import X.HL6;
import X.HZV;
import X.IO7;
import X.JCe;
import X.JE9;
import X.RPC;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageFormat;
import android.net.Uri;
import com.facebook.avatar.autogen.download.MsgrModelDownloader;
import com.facebook.jni.HybridData;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: AEFaceTrackerManager.class */
public final class AEFaceTrackerManager implements JE9 {
    public static final HGP Companion = new Object();
    public static IO7 delegate;
    public static AEFaceTrackerManager faceTrackerManager;
    public final Context context;
    public final MsgrModelDownloader faceTrackerModelsProvider;
    public boolean isFrameProcessorReady;
    public HybridData mHybridData;
    public Map paths;

    public AEFaceTrackerManager(Context context, MsgrModelDownloader msgrModelDownloader, JCe jCe) {
        this.context = context;
        this.faceTrackerModelsProvider = msgrModelDownloader;
        7zO.A1W(this, 2aG.A02(2aN.A01), 29);
    }

    public static final /* synthetic */ void access$createFaceTracker(AEFaceTrackerManager aEFaceTrackerManager) {
        try {
            C0il.A0C("dynamic_pytorch_impl", 16);
            C0il.A0C("torch-code-gen", 16);
            C0il.A0B("autogen_frameprocessor");
            Map map = aEFaceTrackerManager.paths;
            if (map != null) {
                aEFaceTrackerManager.mHybridData = aEFaceTrackerManager.initHybrid(map);
                aEFaceTrackerManager.isFrameProcessorReady = true;
            }
        } catch (UnsatisfiedLinkError e) {
            0fH.A0r("AEFaceTrackerManager", "Failed to load autogen_frameprocessor", e);
            IO7 io7 = delegate;
            if (io7 != null) {
                HZV hzv = io7.A05.A06;
                HGO.A00(hzv.A00, hzv.A01, "library_load_failed", 36);
            }
            faceTrackerManager = null;
        }
    }

    private final native boolean checkImageValid(byte[] bArr, byte[] bArr2, int i, int i2);

    private final native HybridData initHybrid(Map map);

    private final native AEFaceTrackerResult processImageBuffer(byte[] bArr, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, int i8);

    public final boolean checkImage(String str) {
        11T.A0F(str, 0);
        if (!this.isFrameProcessorReady) {
            return false;
        }
        InputStream openInputStream = this.context.getContentResolver().openInputStream(Uri.parse(str));
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
        11T.A0A(ByteBuffer.allocateDirect(0));
        if (decodeStream == null) {
            return false;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(decodeStream.getByteCount());
        11T.A0A(allocateDirect);
        decodeStream.copyPixelsToBuffer(allocateDirect);
        int width = decodeStream.getWidth();
        int height = decodeStream.getHeight();
        int i = width * height;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(i / 2);
        allocateDirect2.rewind();
        allocateDirect3.rewind();
        byte[] array = allocateDirect2.array();
        11T.A0A(array);
        byte[] array2 = allocateDirect3.array();
        11T.A0A(array2);
        return checkImageValid(array, array2, width, height);
    }

    @Override // X.JE9
    public void onPreviewFrame(RPC rpc) {
        IO7 io7;
        if (this.isFrameProcessorReady) {
            byte[] bArr = HL6.A00(rpc).A0A;
            int i = rpc.A01;
            Integer valueOf = Integer.valueOf(i);
            if (bArr == null || valueOf == null) {
                IO7 io72 = delegate;
                if (io72 != null) {
                    HZV hzv = io72.A05.A06;
                    HGO.A00(hzv.A00, hzv.A01, "unsupported_preview_format", 36);
                }
                this.isFrameProcessorReady = false;
                return;
            }
            int bitsPerPixel = ImageFormat.getBitsPerPixel(i) / 8;
            int i2 = rpc.A03;
            int i3 = rpc.A00;
            AEFaceTrackerResult processImageBuffer = processImageBuffer(bArr, i2, i3, 1.0f, 0, 0, i2, i3, bitsPerPixel, (HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH - rpc.A02) % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH);
            if (processImageBuffer == null || (io7 = delegate) == null || io7.A02) {
                return;
            }
            HBF hbf = (processImageBuffer.isAutogenReady && processImageBuffer.isFace && processImageBuffer.data.length != 0) ? HBF.A02 : processImageBuffer.isFace ? Math.abs(processImageBuffer.pitch) > Math.abs(processImageBuffer.yaw) ? HBF.A08 : processImageBuffer.isEyesClosed ? HBF.A05 : HBF.A06 : HBF.A07;
            if (io7.A00 != hbf) {
                io7.A06.Cvx(hbf);
            }
            io7.A00 = hbf;
        }
    }
}
