package X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.Constants;
import com.facebook.inject.FbInjector;
import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.facebook.messaging.media.viewer.fragment.MediaViewFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.EnableAudioParameters;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebook.stickers.keyboardls.stickergrid.StickerGridView;
import com.facebook.ui.media.contentsearch.ContentSearchResultItemView;
import com.facebook.video.engine.api.VideoPlayerParams;
import com.facebook.widget.FlowLayout;
import com.facebook.widget.refreshableview.RefreshableListViewContainer;
import java.lang.ref.SoftReference;
import java.net.URI;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGL10;

/* renamed from: X.GOs, reason: case insensitive filesystem */
/* loaded from: GOs.class */
public abstract class AbstractC2327GOs {
    public static float A00(float f, float f2, float f3, float f4) {
        return (float) (((Math.atan2(f, f2) - Math.atan2(f3, f4)) * 180.0d) / 3.141592653589793d);
    }

    public static float A01(int i, int i2) {
        return Math.max(i, i2) / Math.min(i, i2);
    }

    public static float A02(View view, float f) {
        return ((float) (Math.sqrt(Math.pow(view.getMeasuredWidth() / 2.0f, 2.0d) + Math.pow(view.getMeasuredHeight() / 2.0f, 2.0d)) / (f / 2.0f))) * 4.0f;
    }

    public static float A03(View view, int i) {
        return (i - view.getHeight()) / 2.0f;
    }

    public static float A04(View view, IDq iDq) {
        return view.getHeight() * iDq.A0A();
    }

    public static float A05(1HU r301, int i) {
        if (i != 0) {
            return r301.A01.getFloat(i + r301.A00);
        }
        return 0.0f;
    }

    public static int A06(int i, String str) {
        GLES20.glShaderSource(i, str);
        GLES20.glCompileShader(i);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(i, 35713, iArr, 0);
        return iArr[0];
    }

    public static int A07(MediaMetadataRetriever mediaMetadataRetriever, int i) {
        Integer A02;
        String extractMetadata = mediaMetadataRetriever.extractMetadata(i);
        int i2 = 0;
        if (extractMetadata != null && (A02 = 1NS.A02(extractMetadata)) != null) {
            i2 = A02.intValue();
        }
        return i2;
    }

    public static int A08(Object obj) {
        return (527 + obj.hashCode()) * 31;
    }

    public static long A09(int i, long j, int i2) {
        return ((j / LBz.A00(i)) / i2) * 1000000;
    }

    public static Rect A0A(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static Rect A0B(DocumentType documentType, float f, int i, int i2) {
        int i3 = (int) (16.0f * f);
        int widthToHeightRatio = (int) ((i2 / 2.0f) - (((i - (i3 * 2)) * (1.0f / documentType.getWidthToHeightRatio())) / 2.0f));
        return new Rect(i3, widthToHeightRatio, i - i3, i2 - widthToHeightRatio);
    }

    public static View A0C(Object obj, int i) {
        View findViewById = ((View) obj).findViewById(i);
        if (findViewById == null) {
            return null;
        }
        findViewById.setVisibility(8);
        return findViewById;
    }

    public static C04r A0D(A31 a31, Object obj, Object obj2, List list) {
        C0B7.A04(obj, 1);
        list.add(obj);
        C04r c04r = a31.A03;
        C0B7.A04(obj, 1);
        c04r.put(obj, obj2);
        return c04r;
    }

    public static 1BQ A0E(RefreshableListViewContainer refreshableListViewContainer) {
        refreshableListViewContainer.A0K = 0S2.A00;
        refreshableListViewContainer.A0B = 0;
        refreshableListViewContainer.A0C = 0;
        refreshableListViewContainer.A00 = 1.0d;
        refreshableListViewContainer.A01 = 0.0f;
        refreshableListViewContainer.A03 = 0.0f;
        refreshableListViewContainer.A02 = 0.0f;
        refreshableListViewContainer.A04 = -1.0f;
        refreshableListViewContainer.A05 = -1.0f;
        refreshableListViewContainer.A06 = -1.0f;
        refreshableListViewContainer.A0M = false;
        refreshableListViewContainer.A0H = new Handler();
        return new 1BQ(16501);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.Hio, java.lang.Object] */
    public static Hio A0F(IPn iPn) {
        SoftReference softReference = iPn.A05;
        if (softReference == null) {
            return null;
        }
        int[] iArr = iPn.A0A;
        int i = iPn.A00;
        ?? obj = new Object();
        obj.A05 = softReference;
        obj.A02 = null;
        obj.A04 = null;
        obj.A06 = iArr;
        obj.A00 = 0.0f;
        obj.A03 = null;
        obj.A01 = i;
        return obj;
    }

    public static I8F A0G(View view, IAP iap) {
        I8F i8f = new I8F(view);
        I8F.A00(i8f.A00, i8f, true);
        IAP.A01(iap.A00, iap, true);
        return i8f;
    }

    public static IML A0H(GWo gWo) {
        Context context = gWo.A05;
        return (IML) 1Lm.A05(context, 1Fw.A04((1EZ) 1Bu.A06(context, 16428)), 100047);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.66T, java.lang.Object] */
    public static 66T A0I(int i, int i2) {
        ?? obj = new Object();
        obj.A03(i);
        obj.A04(i2);
        obj.A01(i);
        obj.A02(i2);
        return obj;
    }

    public static 1CO A0J(C00i c00i) {
        return 2eV.A00((2eV) c00i.get());
    }

    public static FEf A0K(String str) {
        ExD exD = new ExD();
        exD.A01();
        exD.A02 = str;
        return exD.A00();
    }

    public static 6TF A0L(FbUserSession fbUserSession, 6TA r302) {
        VideoPlayerParams videoPlayerParams = new VideoPlayerParams(r302);
        6TF r0 = new 6TF();
        r0.A03 = videoPlayerParams;
        r0.A01 = fbUserSession;
        return r0;
    }

    public static C1kn A0M() {
        C1k8 c1k8 = new C1k8();
        c1k8.A05(2073600000L, TimeUnit.MILLISECONDS);
        return c1k8.A02();
    }

    public static IllegalStateException A0N(String str, String str2) {
        return new IllegalStateException(Integer.valueOf(android.util.Log.w(str, str2)).toString());
    }

    public static Object A0O(1BY r301) {
        return 1Hv.A02((Context) 1Bn.A0E((Context) null, r301, 83719), 67953);
    }

    public static RuntimeException A0P(String str, EGL10 egl10) {
        return new RuntimeException(0Pz.A0W(str, Integer.toHexString(egl10.eglGetError())));
    }

    public static String A0Q(1UG r301, GRS grs, String str) {
        r301.A7R("streaming_format", str);
        r301.A5H("playback_is_live_streaming", Boolean.valueOf(grs.A1D()));
        return grs.BJQ();
    }

    public static String A0R(1HU r301) {
        int A04 = r301.A04();
        if (A04 != 0) {
            return r301.A0A(A04 + r301.A00);
        }
        return null;
    }

    public static String A0S(Enum r301, StringBuilder sb) {
        String name = r301.name();
        if (name != null) {
            sb.append(name);
            sb.append(" (");
        }
        return name;
    }

    public static String A0T(Object obj, String str, AbstractMap abstractMap) {
        return abstractMap.containsKey(obj) ? (String) abstractMap.get(obj) : str;
    }

    public static String A0U(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    public static String A0V(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(":");
        sb.append(str2);
        return ":";
    }

    public static String A0W(StringBuilder sb, int i) {
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public static String A0X(StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public static URI A0Y(Uri.Builder builder) {
        return new URI(builder.build().toString());
    }

    public static ArrayList A0Z(Rect rect) {
        rect.intersect(-1000, -1000, 1000, 1000);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Camera.Area(rect, 1000));
        return arrayList;
    }

    public static void A0a() {
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
    }

    public static void A0b(Resources resources, View view, int i, int i2) {
        view.setPadding(resources.getDimensionPixelOffset(i), view.getPaddingTop(), FbInjector.A03.getResources().getDimensionPixelOffset(i2), view.getPaddingBottom());
    }

    public static void A0c(Sensor sensor, SensorEventListener sensorEventListener, SensorManager sensorManager, IOb iOb) {
        if (sensorManager.registerListener(sensorEventListener, sensor, iOb.A06, iOb.A03)) {
            C0Ax.A00.A05(sensorEventListener, sensor);
        }
    }

    public static void A0d(MediaFormat mediaFormat, I4t i4t, boolean z) {
        mediaFormat.setInteger("profile", z ? 1 : 0);
        mediaFormat.setInteger("level", 1024);
        if (i4t.A02 == 7) {
            mediaFormat.setInteger("profile", 2);
            mediaFormat.setInteger("level", Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
            if (Build.VERSION.SDK_INT >= 33) {
                mediaFormat.setFeatureEnabled("hdr-editing", z);
            }
        }
    }

    public static void A0e(View view) {
        view.setMinimumHeight(view.getResources().getDimensionPixelSize(2132279345));
        view.setBackground((Drawable) 0NA.A09(view.getContext(), R.attr.selectableItemBackground).or(new ColorDrawable(0)));
    }

    public static void A0f(View view, ContentSearchResultItemView contentSearchResultItemView, int i) {
        view.setVisibility(i);
        contentSearchResultItemView.A03.setVisibility(8);
        if (contentSearchResultItemView.A01 != null) {
            ((KnJ) contentSearchResultItemView.A0D.get()).A00(contentSearchResultItemView.A01);
            contentSearchResultItemView.A01.setVisibility(8);
        }
    }

    public static void A0g(TextView textView, boolean z) {
        textView.setTextIsSelectable(z);
        textView.setFocusable(z);
        textView.setFocusableInTouchMode(z);
        textView.setEnabled(z);
        textView.setClickable(z);
        textView.setLongClickable(z);
    }

    public static void A0h(C07n c07n, C07n c07n2, 0D7 r303, 0DA r304) {
        r304.A01(c07n, "poll_type");
        r304.A01(c07n2, "thread_type");
        r303.A0A(r304, "poll");
        r303.BZL();
    }

    public static void A0i(C07n c07n, 0D7 r302, 0DA r303) {
        r303.A01(c07n, "thread_type");
        r302.A0A(r303, "poll");
        r302.BZL();
    }

    public static void A0j(0DA r301, long j) {
        r301.A07("referrer_surface", "message_thread");
        r301.A07("sticker_usage_type", "message_thread");
        r301.A06("sticker_usage_id", Long.valueOf(j));
    }

    public static void A0k(0DA r301, 1UG r302, String str) {
        if (r302.isSampled()) {
            r302.A7T(r301, "event_data");
            r302.A7R("avatar_session_id", str);
            r302.A7R("product", "search");
            r302.BZL();
        }
    }

    public static void A0l(1UG r301, LiveLocationSession liveLocationSession, String str) {
        r301.A7R("live_location_session_id", UUID.nameUUIDFromBytes(0Pz.A0g(str, liveLocationSession.A02, liveLocationSession.A01).getBytes()).toString());
    }

    public static void A0m(1UG r301, ThreadKey threadKey, long j) {
        r301.A6H("thread_id", Long.valueOf(j));
        r301.A5c(C7ks.A00(threadKey, false), "thread_type");
        r301.BZL();
    }

    public static void A0n(1UG r301, HCA hca) {
        r301.A6H(TraceFieldType.ErrorCode, Long.valueOf(hca.errorCode));
    }

    public static void A0o(1UG r301, Boolean bool, long j) {
        r301.A6H("thread_id", Long.valueOf(j));
        r301.A5H("is_try_again_sticker", bool);
    }

    public static void A0p(1UG r301, String str) {
        if (r301.isSampled()) {
            r301.A7R("client_token", str);
            r301.BZL();
        }
    }

    public static void A0q(I8p i8p) {
        if (i8p != null) {
            i8p.A06++;
        }
    }

    public static void A0r(C00i c00i, CharSequence charSequence) {
        ((F8q) c00i.get()).A01(new FEd(charSequence));
    }

    public static void A0s(MediaViewFragment mediaViewFragment) {
        IDV idv;
        if (((C6kc) mediaViewFragment.A18.get()).A07(mediaViewFragment.A0X) || (idv = mediaViewFragment.A0F) == null) {
            return;
        }
        idv.A0I.setVisibility(8);
    }

    public static void A0t(UserFlowLogger userFlowLogger, String str, int i, long j) {
        userFlowLogger.markPointWithEditor(j, str).addPointData("shown_active_entity_count", i).markerEditingCompleted();
    }

    public static void A0u(AudioApi audioApi, int i, boolean z) {
        audioApi.enableAudio(C0s8.A10(new EnableAudioParameters(null, i, z)));
    }

    public static void A0v(StickerGridView stickerGridView) {
        stickerGridView.A08.setVisibility(8);
        stickerGridView.A04.setVisibility(8);
        stickerGridView.A03.setVisibility(8);
        stickerGridView.A02.setVisibility(0);
    }

    public static void A0w(FlowLayout flowLayout) {
        flowLayout.A02 = -1;
        flowLayout.A01 = 0;
        flowLayout.A04 = 0;
        flowLayout.A00 = 51;
        flowLayout.A03 = 1;
    }

    public static void A0x(Object obj, Object obj2) {
        4zI.A03.A05("VideoChatLinksAnalyticsLogger", "Event: %s. Link: %s.", new Object[]{obj, obj2});
    }

    public static void A0y(Object obj, Object obj2, java.util.Map map) {
        Set set = (Set) map.get(obj);
        if (set != null) {
            set.remove(obj2);
            if (set.isEmpty()) {
                map.remove(obj);
            }
        }
    }

    public static void A0z(AtomicReference atomicReference) {
        Object obj = atomicReference.get();
        obj.getClass();
        ((CountDownLatch) obj).countDown();
    }

    public static boolean A10(MediaFormat mediaFormat, I4t i4t) {
        mediaFormat.setInteger("color-format", 2130708361);
        mediaFormat.setInteger(TraceFieldType.Bitrate, i4t.A00);
        mediaFormat.setInteger("frame-rate", i4t.A03);
        mediaFormat.setInteger("i-frame-interval", 5);
        mediaFormat.setInteger("channel-count", 1);
        mediaFormat.setInteger("max-input-size", 0);
        if (i4t.A09) {
            mediaFormat.setInteger("color-range", 2);
            mediaFormat.setInteger("color-standard", i4t.A01);
            mediaFormat.setInteger("color-transfer", i4t.A02);
        }
        return true;
    }

    public static boolean A11(C00i c00i, MediaViewFragment mediaViewFragment) {
        return ((C6kc) c00i.get()).A06(mediaViewFragment.A0X);
    }

    public static boolean A12(C00i c00i, MediaViewFragment mediaViewFragment) {
        return ((C6kc) c00i.get()).A05(mediaViewFragment.A0X);
    }

    public static boolean A13(1YC r301, AtomicInteger atomicInteger) {
        int i = C1Y6.A00;
        Boolean A00 = AnonymousClass617.A00(i);
        return A00 != null ? A00.booleanValue() : AnonymousClass617.A01(r301, atomicInteger, i);
    }

    public static Object[] A14(Object obj) {
        Class<?> cls = obj.getClass();
        11T.A0F(cls, 0);
        return Arrays.copyOf(new Object[]{new 0BY(cls)}, 1);
    }
}
