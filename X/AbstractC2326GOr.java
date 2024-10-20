package X;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.ipc.media.MediaItem;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.logging.MontagePostReliabilityLogging;
import com.facebook.messaging.reactions.FastMessageReactionsPanelView;
import com.facebook.messaging.reactions.model.ReactionsSet;
import com.facebook.messaging.rtc.incall.impl.active.ActiveCallControls;
import com.facebook.messaging.rtc.incall.impl.active.callcontrols.ui.MsgrCallControlsView;
import com.facebook.messaging.rtc.incall.impl.mediasync.playbackview.MediaSyncPlaybackView;
import com.facebook.msys.mci.Execution;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.rp.omnigrid.arlogrid.ArloGridNative;
import com.facebook.rp.omnigrid.builder.GridLayoutOutputBuilder;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.state.gen.State;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;
import com.facebook.samples.zoomable.ZoomableDraweeView;
import com.facebook.stickers.generatedstickers.search.GeneratedStickerSearchFragment;
import com.facebook.stickers.ui.StickerDraweeView;
import com.facebook.user.model.UserKey;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.wearable.common.comms.hera.shared.context.HeraContext;
import com.facebook.wearable.common.comms.hera.shared.host.config.HeraHostConfigBuilder;
import com.google.common.base.Objects;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.CancellationException;

/* renamed from: X.GOr, reason: case insensitive filesystem */
/* loaded from: GOr.class */
public abstract class AbstractC2326GOr {
    public static float A00(float f, float f2) {
        return (float) (f + ((1.0d - GSY.A00) * f2));
    }

    public static float A01(View view, IDq iDq) {
        return view.getWidth() * iDq.A09();
    }

    public static int A02(int i) {
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        int i2 = 270;
        if (i != 3) {
            i2 = 0;
        }
        return i2;
    }

    public static int A03(int i) {
        return (527 + i) * 31;
    }

    public static int A04(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES20.glBindTexture(i, i2);
        GLES20.glTexParameterf(i, 10241, 9729.0f);
        GLES20.glTexParameterf(i, 10240, 9729.0f);
        GLES20.glTexParameterf(i, 10242, 33071.0f);
        GLES20.glTexParameterf(i, 10243, 33071.0f);
        return i2;
    }

    public static int A05(Fragment fragment) {
        return fragment.requireContext().getResources().getConfiguration().orientation;
    }

    public static int A06(Boolean bool, boolean z) {
        return bool.compareTo(Boolean.valueOf(z));
    }

    public static int A07(String str) {
        return (527 + str.hashCode()) * 31;
    }

    public static int A08(ByteBuffer byteBuffer, int i) {
        return i - byteBuffer.getInt(i);
    }

    public static int A09(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i + i2;
        return i3 + byteBuffer.getInt(i3);
    }

    public static int A0A(float[] fArr, float f, float f2, float f3, int i) {
        return (int) Math.round(Math.hypot(f - f2, fArr[i] - f3));
    }

    public static long A0B(6UZ r301) {
        if (r301.A0U()) {
            return Math.max(0L, r301.A09() - r301.A0C());
        }
        return 0L;
    }

    public static LayoutInflater A0C(Fragment fragment, 2yD r302) {
        boolean AZk = r302.AZk(36326369533449739L);
        Context requireContext = fragment.requireContext();
        if (!AZk) {
            return LayoutInflater.from(requireContext);
        }
        LayoutInflater from = LayoutInflater.from(requireContext);
        11T.A0A(from);
        return new GTp(fragment.requireContext(), from);
    }

    public static View A0D(0D2 r301) {
        return r301.A01.getWindow().getDecorView();
    }

    public static C2511Gfr A0E(ZoomableDraweeView zoomableDraweeView) {
        zoomableDraweeView.A01 = true;
        zoomableDraweeView.A02 = true;
        return new C2511Gfr(zoomableDraweeView, 4);
    }

    public static DKN A0F(1De r301) {
        1BY r0 = r301.A00;
        1Fw.A04((1EZ) 1Bn.A0E((Context) null, r0, 16428));
        return (DKN) 1Bn.A0E((Context) null, r0, 68643);
    }

    public static MediaItem A0G(I9Q i9q) {
        return new MediaItem(new MediaData(i9q));
    }

    public static I5Y A0H(1UG r301, C00i c00i, String str, String str2) {
        r301.A7R(str, str2);
        return (I5Y) c00i.get();
    }

    public static AnonymousClass474 A0I(1Br r301, String str) {
        return ((AnonymousClass472) r301.A00.get()).A00(new UserKey(1Js.A03, str));
    }

    public static ICJ A0J(C2389Gbr c2389Gbr) {
        return (ICJ) c2389Gbr.A00.get();
    }

    public static IAZ A0K(C2390Gbs c2390Gbs) {
        return (IAZ) c2390Gbs.A00.get();
    }

    public static IML A0L(Context context, FbUserSession fbUserSession) {
        return (IML) 1Lm.A05(context, fbUserSession, 100047);
    }

    public static GrG A0M(MediaSyncPlaybackView mediaSyncPlaybackView) {
        return (GrG) mediaSyncPlaybackView.A0L.getValue();
    }

    public static I9M A0N(View view) {
        Context context = view.getContext();
        11T.A0A(context);
        return (I9M) 1Hv.A02(context, 115775);
    }

    public static 5II A0O(FastMessageReactionsPanelView fastMessageReactionsPanelView) {
        fastMessageReactionsPanelView.A0a = "";
        fastMessageReactionsPanelView.A0h = true;
        fastMessageReactionsPanelView.A0T = new ReactionsSet();
        return (5II) 1Bi.A03(68025);
    }

    public static 2rS A0P(1Iw r301, C2fs c2fs, int i) {
        2rS A00 = 2rR.A00(r301);
        A00.A2c(7tA.A01(c2fs.BIe()));
        A00.A2a(3);
        A00.A01.A05 = i;
        return A00;
    }

    public static 1CO A0Q(GeneratedStickerSearchFragment generatedStickerSearchFragment) {
        return AnonymousClass842.A00(GeneratedStickerSearchFragment.A05(generatedStickerSearchFragment));
    }

    public static JIo A0R(Object obj, 0G2 r302, C06z[] c06zArr) {
        return (JIo) r302.BIk(obj, c06zArr[1]);
    }

    public static CallModel A0S(1Br r301) {
        2JS A01 = ((2JN) r301.A00.get()).A01();
        2JQ r0 = CallModel.CONVERTER;
        11T.A0B(r0);
        return (CallModel) A01.A02(r0);
    }

    public static State A0T(C00i c00i) {
        2JS A01 = ((2JN) c00i.get()).A01();
        2JQ r0 = State.CONVERTER;
        11T.A0B(r0);
        return (State) A01.A01(r0);
    }

    public static 4zJ A0U(Object obj) {
        11T.A0F(obj, 0);
        return 4zI.A03;
    }

    public static C2632Gji A0V(Object obj) {
        GridLayoutInput gridLayoutInput = (GridLayoutInput) obj;
        11T.A0F(gridLayoutInput, 0);
        HJw hJw = ArloGridNative.Companion;
        GridLayoutOutputBuilder gridLayoutOutputBuilder = new GridLayoutOutputBuilder(gridLayoutInput);
        ArloGridNative.jni_computeArloGridLayout(gridLayoutInput, gridLayoutOutputBuilder);
        return gridLayoutOutputBuilder.build();
    }

    public static C66i A0W(1Br r301) {
        return new C66i((C62j) r301.A00.get());
    }

    public static 6TA A0X(6AB r301, 6A9 r302) {
        r302.A04 = r301;
        VideoDataSource videoDataSource = new VideoDataSource(r302);
        6TA r0 = new 6TA();
        r0.A0U = videoDataSource;
        return r0;
    }

    public static HuY A0Y(Collection collection) {
        return (HuY) new ArrayList(collection).get(0);
    }

    public static HeraContext A0Z(HeraHostConfigBuilder heraHostConfigBuilder, Object obj) {
        11T.A0F(obj, 0);
        return heraHostConfigBuilder.heraContext;
    }

    public static Hn2 A0a() {
        return (Hn2) 1Bi.A03(116389);
    }

    public static IOException A0b(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid byte order: ");
        sb.append(obj);
        return new IOException(sb.toString());
    }

    public static Integer A0c(AbstractMap abstractMap, int i) {
        Integer valueOf = Integer.valueOf(i);
        if (!abstractMap.containsKey(valueOf)) {
            abstractMap.put(valueOf, new C7sj());
        }
        return valueOf;
    }

    public static RuntimeException A0d(String str) {
        return new RuntimeException(0Pz.A0W(str, Integer.toHexString(EGL14.eglGetError())));
    }

    public static String A0e(int i, String str) {
        11T.A0F(str, 0);
        return 0Pz.A0M(str, '_', i);
    }

    public static String A0f(long j) {
        int round = Math.round(((float) j) / 1000.0f);
        return StringFormatUtil.formatStrLocaleSafe("%d:%02d", Integer.valueOf(round / 60), Integer.valueOf(round % 60));
    }

    public static String A0g(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        return readString;
    }

    public static String A0h(1HU r301, int i) {
        return r301.A0A(i + r301.A00);
    }

    public static String A0i(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    public static StringBuilder A0j(Object obj, StringBuilder sb, StringBuilder sb2) {
        sb.append(obj);
        sb2.append(sb.toString());
        return new StringBuilder();
    }

    public static FloatBuffer A0k(float[] fArr, int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        return asFloatBuffer;
    }

    public static HashMap A0l(AbstractC01593ro abstractC01593ro, Object obj) {
        abstractC01593ro.A06("pigeon_reserved_keyword_module", "webrtc");
        HashMap hashMap = new HashMap();
        hashMap.put("call_trigger_grouping", obj);
        return hashMap;
    }

    public static CancellationException A0m() {
        return new CancellationException("Invalid camera session");
    }

    public static C01h A0n(MsgrCallControlsView msgrCallControlsView) {
        msgrCallControlsView.setLayoutTransition(new LayoutTransition());
        msgrCallControlsView.setClipChildren(false);
        msgrCallControlsView.A00 = GjU.A04;
        return C01g.A01(J9g.A00);
    }

    public static short A0o(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getShort(i + 4);
    }

    public static short A0p(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getShort(i + 6);
    }

    public static void A0q(int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
    }

    public static void A0r(int i, int i2, int i3, int i4, int i5) {
        GLES20.glViewport(i, i2, i3, i4);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(i5, 0);
    }

    public static void A0s(Canvas canvas, Paint paint, Rect rect, int i) {
        paint.setColor(i);
        canvas.drawRect(rect.left, rect.top, rect.right, rect.bottom, paint);
    }

    public static void A0t(MediaCodec.BufferInfo bufferInfo, Buffer buffer) {
        buffer.position(bufferInfo.offset);
        buffer.limit(bufferInfo.offset + bufferInfo.size);
    }

    public static void A0u(MediaFormat mediaFormat) {
        if (!mediaFormat.containsKey("encoder-delay") || mediaFormat.getInteger("encoder-delay") <= 10000) {
            return;
        }
        mediaFormat.setInteger("encoder-delay", 0);
    }

    public static void A0v(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readInt() != 0) {
            parcel.readParcelable(classLoader);
        }
    }

    public static void A0w(Parcelable parcelable, 1I7 r302, String str, double d) {
        Intent intent = new Intent(str);
        intent.putExtra("resource", parcelable);
        intent.putExtra(K92.__redex_internal_original_name, d);
        r302.CkS(intent);
    }

    public static void A0x(View view) {
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public static void A0y(View view) {
        11T.A0D(view);
        view.setVisibility(8);
    }

    public static void A0z(View view) {
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            11T.A0I(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static void A10(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static void A11(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public static void A12(ViewPropertyAnimator viewPropertyAnimator, ActiveCallControls activeCallControls, float f, float f2) {
        ViewPropertyAnimator translationX = viewPropertyAnimator.translationX(f2 * ((-1.0f) + f));
        if (translationX != null) {
            translationX.setInterpolator(activeCallControls.A0w);
        }
    }

    public static void A13(TextView textView, Object obj, String str) {
        textView.setText(StringFormatUtil.formatStrLocaleSafe(str, obj));
    }

    public static void A14(AbstractC01593ro abstractC01593ro, java.util.Map map) {
        abstractC01593ro.A08(map);
        0fH.A0V(abstractC01593ro.A09(), HxP.class, "event: %s, params: %s", map);
        abstractC01593ro.A0A();
    }

    public static void A15(C07n c07n, 0DA r302, ThreadKey threadKey, String str) {
        r302.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        r302.A07("key", threadKey.A0u());
        r302.A01(c07n, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public static void A16(C07n c07n, 0DA r302, String str) {
        r302.A01(c07n, "entry_point");
        r302.A07("thread_id", str);
    }

    public static void A17(C07n c07n, 1UG r302, String str, boolean z) {
        r302.A5H("is_chathead", Boolean.valueOf(z));
        r302.A5c(c07n, "thread_type");
        r302.A7R("thread_id", str);
        r302.BZL();
    }

    public static void A18(0DA r301, 1UG r302, String str) {
        if (r302.isSampled()) {
            r302.A7T(r301, "event_data");
            r302.A7R("avatar_session_id", str);
            r302.A7R("product", "navigation");
            r302.BZL();
        }
    }

    public static void A19(0DA r301, C00i c00i, String str, String str2) {
        if (((2yD) c00i.get()).AZk(36321228457918584L)) {
            r301.A07("avatar_style_id", str);
            r301.A07("avatar_revision_id", str2);
        }
    }

    public static void A1A(1UG r301, MontagePostReliabilityLogging montagePostReliabilityLogging, String str, String str2) {
        r301.A7R(str, str2);
        r301.A7R("composer_entry_picker", montagePostReliabilityLogging.A03);
        r301.A6J("payload", montagePostReliabilityLogging.A01);
        r301.A0A("is_edit_composer");
    }

    public static void A1B(1UG r301, 2QN r302) {
        String str = r302.A0J;
        if (str.length() != 0) {
            r301.A7R("server_info_data", str);
        }
    }

    public static void A1C(1UG r301, String str, boolean z) {
        r301.A7R("creation_session_id", str);
        r301.A5H("is_selfie_view", Boolean.valueOf(z));
    }

    public static void A1D(GraphQlQueryParamSet graphQlQueryParamSet, 2Jf r302) {
        r302.A00 = graphQlQueryParamSet;
        1Hz r0 = new 1Hz();
        r0.A05(109250890);
        r0.A07();
    }

    public static void A1E(C00i c00i, boolean z) {
        ((JOJ) c00i.get()).Bb0(z);
        ((JOJ) c00i.get()).BZn("TOGGLE_RAISE_HAND");
    }

    public static void A1F(1Br r301) {
        C00i c00i = r301.A00;
        ((1vE) c00i.get()).A07.set(true);
        ((1vE) c00i.get()).A01();
    }

    public static void A1G(1Iw r301, LithoView lithoView, boolean z) {
        C1s0 c1s0 = new C1s0(r301);
        c1s0.A01(z);
        lithoView.A0z(c1s0.A00());
    }

    public static void A1H(2QN r301, IRF irf) {
        ((C03243xh) irf.A18.A00.get()).A00(r301.BQN());
    }

    public static void A1I(F8q f8q, int i) {
        f8q.A01(new FEd(i));
    }

    public static void A1J(GRS grs, String str) {
        PlayerOrigin B3c = grs.B3c();
        if (str == null || B3c == null) {
            return;
        }
        grs.A1I.A08(new GR4(B3c, str));
    }

    public static void A1K(6TX r301, Integer num, boolean z) {
        r301.A02(num, String.valueOf(z));
    }

    public static void A1L(1HU r301, 1HU r302, int i) {
        ByteBuffer byteBuffer = r301.A01;
        r302.A00 = i;
        r302.A01 = byteBuffer;
    }

    public static void A1M(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    public static void A1N(Object obj, int i) {
        44X.A00(0DL.A00, new AJU(obj, null, i));
    }

    public static void A1O(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put("peer_id", obj);
        abstractMap.put("group_participant_count", 0);
        if (obj2 != null) {
            abstractMap.put("is_video_call", obj2);
        }
    }

    public static void A1P(Object obj, String str, String str2) {
        1UG A00 = 1UD.A00((1UD) obj, 1ZG.A01, str);
        if (A00.isSampled()) {
            A00.A7R("creation_session_id", str2);
            A00.BZL();
        }
    }

    public static void A1Q(Object obj, StringBuilder sb, int i, boolean z) {
        sb.append(CQq.A07(obj, i, z));
    }

    public static void A1R(StringBuilder sb) {
        sb.append("uniform sampler2D y_tex;\n");
        sb.append("uniform sampler2D u_tex;\n");
        sb.append("uniform sampler2D v_tex;\n");
        sb.append("vec4 sample(vec2 p) {\n");
        sb.append("  float y = texture2D(y_tex, p).r * 1.16438;\n");
        sb.append("  float u = texture2D(u_tex, p).r;\n");
        sb.append("  float v = texture2D(v_tex, p).r;\n");
        sb.append("  return vec4(y + 1.59603 * v - 0.874202,\n");
        sb.append("    y - 0.391762 * u - 0.812968 * v + 0.531668,\n");
        sb.append("    y + 2.01723 * u - 1.08563, 1);\n");
        sb.append("}\n");
    }

    public static void A1S(Throwable th, AbstractMap abstractMap) {
        abstractMap.put("error", th.toString());
        String stackTraceString = android.util.Log.getStackTraceString(th);
        11T.A0D(stackTraceString);
        abstractMap.put(TraceFieldType.Error, stackTraceString);
    }

    public static void A1T(float[] fArr, float f, float f2, float f3, float f4) {
        fArr[2] = f;
        fArr[3] = f2;
        fArr[4] = f3;
        fArr[5] = f4;
    }

    public static boolean A1U() {
        Execution.initialize();
        C0il.A0B("jniperflogger");
        return I86.A00().A01();
    }

    public static boolean A1V() {
        return ((2QO) 1Lm.A06(1Fw.A04((1EZ) 1Bn.A0A(16428)), 99977)).A0S;
    }

    public static boolean A1W(View view) {
        boolean z = false;
        if (view.getParent() == null) {
            z = true;
        }
        return z;
    }

    public static boolean A1X(C00i c00i) {
        return ((2yD) c00i.get()).AZk(36321228457853047L);
    }

    public static boolean A1Y(StickerDraweeView stickerDraweeView) {
        return ((2yD) stickerDraweeView.A02.get()).AZk(36313080908879438L);
    }

    public static boolean A1Z(6TI r301, 6TI r302) {
        return !Objects.equal(r301.A03(), r302.A03());
    }

    public static byte[] A1a(SparseArray sparseArray, int i) {
        return (byte[]) sparseArray.get(i);
    }

    public static byte[] A1b(String str) {
        Charset forName = Charset.forName("UTF-8");
        11T.A0A(forName);
        byte[] bytes = str.getBytes(forName);
        11T.A0A(bytes);
        return bytes;
    }
}
