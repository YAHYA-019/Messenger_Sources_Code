package com.facebook.msys.mcp.loadgeneratorplugin;

import X.0Pz;
import X.0fH;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BY;
import X.2Cb;
import X.2EU;
import X.7zL;
import X.AnonymousClass001;
import X.C00i;
import X.C04I;
import X.GOn;
import X.GOo;
import X.I69;
import X.JEg;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import android.view.Surface;
import com.facebook.common.dextricks.DexStore;
import com.facebook.inject.FbInjector;
import com.facebook.proxygen.TraceFieldType;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Random;

/* loaded from: LoadGeneratorPluginSessionless.class */
public class LoadGeneratorPluginSessionless extends Sessionless {
    public static final int videoFps = 30;
    public 1BY _UL_mInjectionContext;
    public final C00i mWebpEncoder = 1BQ.A02(115062);

    public static 2EU createRandomBitmap(int i, int i2) {
        2EU A04 = 2Cb.A01().A06().A04(i, i2);
        int i3 = i * i2;
        int[] iArr = new int[i3];
        Random random = new Random();
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= i3) {
                ((Bitmap) A04.A09()).setPixels(iArr, 0, i, 0, 0, i, i2);
                return A04;
            }
            iArr[i5] = random.nextInt();
            i4 = i5 + 1;
        }
    }

    public static void encodeRandomFrames(int i, MediaCodec mediaCodec, MediaMuxer mediaMuxer, int i2, int i3) {
        int i4 = -1;
        for (int i5 = 0; i5 < i; i5++) {
            long j = -1;
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(j);
            if (dequeueInputBuffer >= 0) {
                ByteBuffer inputBuffer = mediaCodec.getInputBuffer(dequeueInputBuffer);
                generateRandomFrame(inputBuffer, i2, i3);
                StringBuilder A0n = AnonymousClass001.A0n("frame: ");
                A0n.append(i5);
                A0n.append(" dequeue buf: ");
                A0n.append(inputBuffer);
                A0n.append(" buf cap: ");
                A0n.append(inputBuffer.capacity());
                Log.d("VideoGeneration", AnonymousClass001.A0e(" inBufIdx: ", A0n, dequeueInputBuffer));
                mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, inputBuffer.capacity(), (DexStore.MS_IN_NS * i5) / 30, 0);
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j);
            if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = mediaCodec.getOutputFormat();
                if (i4 == -1) {
                    i4 = mediaMuxer.addTrack(outputFormat);
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("outFmt: ");
                    A0k.append(outputFormat);
                    1BL.A1L(" track: ", " outIdx: ", A0k, i4, dequeueOutputBuffer);
                    Log.d("VideoGeneration", A0k.toString());
                    mediaMuxer.start();
                }
                dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j);
            }
            Log.d("VideoGeneration", 0Pz.A0C(i5, dequeueOutputBuffer, "frame: ", " outIdx: "));
            while (dequeueOutputBuffer >= 0) {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                mediaMuxer.writeSampleData(i4, outputBuffer, bufferInfo);
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                StringBuilder A0k2 = AnonymousClass001.A0k();
                A0k2.append("write frame: ");
                A0k2.append(i5);
                A0k2.append(" pts: ");
                A0k2.append(bufferInfo.presentationTimeUs);
                Log.d("VideoGeneration", AnonymousClass001.A0Z(outputBuffer, " buf: ", A0k2));
                dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            }
        }
    }

    public static void generateRandomFrame(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.clear();
        int capacity = byteBuffer.capacity();
        Log.d("VideoGeneration", 0Pz.A0C(capacity, ((i * i2) * 3) / 2, "buffer capacity: ", " WxHx3/2: "));
        Random random = new Random();
        for (int i3 = 0; i3 < capacity; i3++) {
            byteBuffer.put((byte) random.nextInt(255));
        }
        byteBuffer.position(0);
    }

    public static String generateRandomImage(int i, int i2) {
        2EU createRandomBitmap = createRandomBitmap(i, i2);
        String saveToTemporaryPath = saveToTemporaryPath(7zL.A0C(createRandomBitmap));
        createRandomBitmap.close();
        return saveToTemporaryPath;
    }

    public static String saveToTemporaryPath(Bitmap bitmap) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("burner_");
        A0k.append(C04I.A00());
        File A0D = AnonymousClass001.A0D(FbInjector.A00().getCacheDir(), AnonymousClass001.A0d(".jpg", A0k));
        try {
            FileOutputStream A14 = GOn.A14(A0D);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, A14);
                A14.flush();
                A14.close();
                return A0D.getAbsolutePath();
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static String saveToWebpTemporaryPath(JEg jEg, Bitmap bitmap) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("burner_");
        A0k.append(C04I.A00());
        File A0D = AnonymousClass001.A0D(FbInjector.A00().getCacheDir(), AnonymousClass001.A0d(".webp", A0k));
        try {
            FileOutputStream A14 = GOn.A14(A0D);
            try {
                jEg.AH6(bitmap, A14, 90);
                A14.flush();
                A14.close();
                return A0D.getAbsolutePath();
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.facebook.msys.mcp.loadgeneratorplugin.Sessionless
    public String LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomDocumentPathCreate(String str, int i) {
        String str2;
        String A0j = 0Pz.A0j(FbInjector.A00().getCacheDir().toString(), "/", 0Pz.A0j("burner_", 1BK.A0t(), I69.A02(str)));
        0fH.A0g(A0j, "DocumentGeneration", "Document generation saving to: %s");
        File A0E = AnonymousClass001.A0E(A0j);
        try {
            if (!A0E.exists()) {
                A0E.createNewFile();
            }
        } catch (IOException e) {
            0fH.A0r("DocumentGeneration", "IOException while creating new file", e);
        }
        try {
            FileOutputStream A14 = GOn.A14(A0E);
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= i) {
                    break;
                }
                try {
                    byte[] bArr = new byte[1024];
                    new Random().nextBytes(bArr);
                    A14.write(bArr, 0, 1024);
                    i2 = i3 + 1;
                } finally {
                }
            }
            A14.close();
        } catch (FileNotFoundException e2) {
            e = e2;
            str2 = "FileNotFoundException while generating document";
            0fH.A0r("DocumentGeneration", str2, e);
            0fH.A0j("DocumentGeneration", "Document generation done");
            return A0j;
        } catch (IOException e3) {
            e = e3;
            str2 = "IOException while generating document";
            0fH.A0r("DocumentGeneration", str2, e);
            0fH.A0j("DocumentGeneration", "Document generation done");
            return A0j;
        }
        0fH.A0j("DocumentGeneration", "Document generation done");
        return A0j;
    }

    @Override // com.facebook.msys.mcp.loadgeneratorplugin.Sessionless
    public String LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomGifPathCreate(int i, int i2) {
        2EU createRandomBitmap = createRandomBitmap(i, i2);
        String saveToWebpTemporaryPath = saveToWebpTemporaryPath((JEg) this.mWebpEncoder.get(), 7zL.A0C(createRandomBitmap));
        createRandomBitmap.close();
        return saveToWebpTemporaryPath;
    }

    @Override // com.facebook.msys.mcp.loadgeneratorplugin.Sessionless
    public String LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomImagePathCreate(int i, int i2) {
        return generateRandomImage(i, i2);
    }

    @Override // com.facebook.msys.mcp.loadgeneratorplugin.Sessionless
    public String LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomVideoPathCreate(int i, int i2, int i3) {
        String A0j = 0Pz.A0j(FbInjector.A00().getCacheDir().toString(), "/", 0Pz.A0j("burner_", GOo.A0u(), ".mp4"));
        Log.d("VideoGeneration", 0Pz.A0W("Video generation saving to: ", A0j));
        generateVideoFromRandomFrames(i, i2, i3, A0j);
        Log.d("VideoGeneration", "Video generation done");
        return A0j;
    }

    public void generateVideoFromRandomFrames(int i, int i2, int i3, String str) {
        int i4 = i3 * 30;
        MediaCodec mediaCodec = null;
        try {
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
                createVideoFormat.setInteger(TraceFieldType.Bitrate, i * 10 * i2);
                createVideoFormat.setInteger("frame-rate", 30);
                createVideoFormat.setInteger("i-frame-interval", 1);
                createVideoFormat.setInteger(Property.ICON_TEXT_FIT_WIDTH, i);
                createVideoFormat.setInteger(Property.ICON_TEXT_FIT_HEIGHT, i2);
                createVideoFormat.setInteger("profile", 1);
                MediaCodec createByCodecName = MediaCodec.createByCodecName(new MediaCodecList(0).findEncoderForFormat(createVideoFormat));
                try {
                    createByCodecName.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                    createByCodecName.start();
                    MediaMuxer mediaMuxer = new MediaMuxer(str, 0);
                    encodeRandomFrames(i4, createByCodecName, mediaMuxer, i, i2);
                    createByCodecName.stop();
                    createByCodecName.release();
                    mediaMuxer.stop();
                    mediaMuxer.release();
                } catch (IOException e) {
                    e = e;
                    mediaCodec = createByCodecName;
                    Log.d("VideoGeneration", 0Pz.A0W("exception: ", e.getLocalizedMessage()));
                    if (mediaCodec != null) {
                        try {
                            mediaCodec.stop();
                            mediaCodec.release();
                        } catch (Exception unused) {
                            Log.d("VideoGeneration", "exception in final block:");
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    mediaCodec = createByCodecName;
                    if (mediaCodec != null) {
                        try {
                            mediaCodec.stop();
                            mediaCodec.release();
                            throw th;
                        } catch (Exception unused2) {
                            Log.d("VideoGeneration", "exception in final block:");
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }
}
