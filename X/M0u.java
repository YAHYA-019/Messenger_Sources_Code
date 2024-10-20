package X;

import androidx.compose.ui.platform.AndroidComposeView;
import com.facebook.jni.HybridData;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import com.facebook.wearable.airshield.security.Hash;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.airshield.security.Signature;
import com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine;
import com.facebook.wearable.common.comms.rtc.callengine2.camera.proto.CameraActions$CancelActivateCameraHardware;
import com.facebook.wearable.datax.RemoteChannel;
import com.oculus.applinks.EnableTrust;
import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.jvm.functions.Function2;

/* loaded from: M0u.class */
public final class M0u extends 01I implements Function2 {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public M0u(java.lang.Object r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            r304 = r0
            r0 = r301
            r1 = r303
            r0.A00 = r1
            r0 = r303
            switch(r0) {
                case 0: goto L52;
                case 1: goto L64;
                case 2: goto L76;
                case 3: goto L7d;
                case 4: goto L7d;
                case 5: goto L8f;
                case 6: goto L8f;
                default: goto L34;
            }
        L34:
            java.lang.Class<X.L2f> r0 = X.L2f.class
            r305 = r0
            r0 = 2
            r306 = r0
            java.lang.String r0 = "handleMessage"
            r307 = r0
            java.lang.String r0 = "handleMessage(Lcom/facebook/wearable/datax/RemoteChannel;Lcom/facebook/wearable/datax/TypedBuffer;)V"
            r308 = r0
        L43:
            r0 = r304
            r1 = r306
            r2 = r302
            r3 = r305
            r4 = r307
            r5 = r308
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L52:
            java.lang.Class<androidx.compose.ui.platform.AndroidComposeView> r0 = androidx.compose.ui.platform.AndroidComposeView.class
            r305 = r0
            r0 = 2
            r306 = r0
            java.lang.String r0 = "onRequestFocusForOwner"
            r307 = r0
            java.lang.String r0 = "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z"
            r308 = r0
            goto L43
        L64:
            java.lang.Class<com.facebook.messaging.wearable.callengine.HeraMessengerHostCallEngine> r0 = com.facebook.messaging.wearable.callengine.HeraMessengerHostCallEngine.class
            r305 = r0
            r0 = 2
            r306 = r0
            java.lang.String r0 = "handleActivateCameraFailed"
            r307 = r0
            java.lang.String r0 = "handleActivateCameraFailed(Ljava/lang/String;Ljava/lang/String;)V"
            r308 = r0
            goto L43
        L76:
            java.lang.Class<X.LDe> r0 = X.LDe.class
            r305 = r0
            goto L93
        L7d:
            java.lang.Class<X.LBM> r0 = X.LBM.class
            r305 = r0
            r0 = 2
            r306 = r0
            java.lang.String r0 = "send"
            r307 = r0
            java.lang.String r0 = "send(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Lcom/facebook/wearable/datax/Error;"
            r308 = r0
            goto L43
        L8f:
            java.lang.Class<X.FEu> r0 = X.FEu.class
            r305 = r0
        L93:
            r0 = 2
            r306 = r0
            java.lang.String r0 = "handleLinkFailure"
            r307 = r0
            java.lang.String r0 = "handleLinkFailure(Ljava/util/UUID;Lcom/facebook/wearable/datax/ProtocolException;)V"
            r308 = r0
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M0u.<init>(java.lang.Object, int):void");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        04S A00;
        L4A l4a;
        switch (this.A00) {
            case 0:
                return Boolean.valueOf(AndroidComposeView.A0J((L3g) obj, (L5L) obj2, (AndroidComposeView) ((01K) this).receiver));
            case 1:
                String str = (String) obj;
                11T.A0F(str, 0);
                HeraNativeHostCallEngine heraNativeHostCallEngine = (HeraNativeHostCallEngine) ((01K) this).receiver;
                0fH.A0j("HeraMessengerHostCallEngine", 0Pz.A0z("activateCamera failed with callId = ", str, ", deviceId = ", (String) obj2, ", cancelling camera activation"));
                KEj newBuilder = CameraActions$CancelActivateCameraHardware.newBuilder();
                ((CameraActions$CancelActivateCameraHardware) KGw.A00(newBuilder)).arbitraryCallId_ = str;
                heraNativeHostCallEngine.dispatch(KdM.A00.A00(newBuilder.A05()));
                break;
            case 2:
                11T.A0H(obj, obj2);
                break;
            case 3:
            case 4:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                ByteBuffer byteBuffer2 = (ByteBuffer) obj2;
                11T.A0H(byteBuffer, byteBuffer2);
                LBM lbm = (LBM) ((01K) this).receiver;
                RNK rnk = lbm.A08;
                if (rnk.A03.get() == JR0.A0Q()) {
                    A00 = LBM.A00(lbm, byteBuffer, false);
                    if (11T.A0O(A00, LAk.A08)) {
                        return LBM.A00(lbm, byteBuffer2, !AnonymousClass001.A1P(rnk.A02.get()));
                    }
                    return A00;
                }
                if (!lbm.A0E.get()) {
                    return LAk.A07;
                }
                Rae rae = lbm.A07;
                Lpm lpm = new Lpm(lbm, rae.A01(byteBuffer), rae.A01(byteBuffer2));
                rnk.A02.incrementAndGet();
                rnk.A01.execute(new SCT(rnk, lpm));
                return LAk.A08;
            case 5:
            case 6:
            default:
                UUID uuid = (UUID) obj;
                KLm kLm = (KLm) obj2;
                11T.A0H(uuid, kLm);
                FEu.A00(kLm, (FEu) ((01K) this).receiver, uuid);
                break;
            case 7:
                RemoteChannel remoteChannel = (RemoteChannel) obj;
                Kzi kzi = (Kzi) obj2;
                11T.A0H(remoteChannel, kzi);
                L2f l2f = (L2f) ((01K) this).receiver;
                ByteBuffer byteBuffer3 = kzi.A00;
                if (byteBuffer3 != null) {
                    Hash hash = l2f.A00;
                    if (hash != null) {
                        int i = kzi.A01;
                        if (i != KPp.A01.getNumber()) {
                            0fH.A0u("lam:LinkAuthentication", 0Pz.A0T("Unknown message type ", i), (Throwable) null);
                            break;
                        } else {
                            EnableTrust parseFrom = EnableTrust.parseFrom(byteBuffer3);
                            KXV kxv = Hash.Companion;
                            PublicKey publicKey = l2f.A03;
                            byte[] serialize = publicKey.serialize();
                            11T.A0F(serialize, 0);
                            Hash hash2 = new Hash(null);
                            hash2.hashBytes(serialize);
                            byte[] A05 = parseFrom.identifier_.A05();
                            11T.A0A(A05);
                            Hash hash3 = new Hash(null);
                            hash3.setRaw(A05);
                            if (hash2.equals(hash3)) {
                                R3o r3o = Signature.Companion;
                                byte[] A052 = parseFrom.signature_.A05();
                                11T.A0A(A052);
                                Signature signature = new Signature((HybridData) null);
                                Signature.access$setRaw(signature, A052);
                                if (publicKey.verifySignature(hash, signature)) {
                                    remoteChannel.send(new LAk(RequestDefragmentingOutputStream.BODY_BUFFER_SIZE));
                                    L2f.A00(l2f, new G9E(l2f, 19));
                                    break;
                                } else {
                                    0fH.A0r("lam:LinkAuthentication", "Enable trust failed, invalid signature", (Throwable) null);
                                    l4a = L4A.A03;
                                }
                            } else {
                                0fH.A0r("lam:LinkAuthentication", "Enable trust failed, identity mismatch", (Throwable) null);
                                l4a = L4A.A02;
                            }
                            remoteChannel.send(new LAk(l4a.A00));
                            break;
                        }
                    } else {
                        0fH.A0r("lam:LinkAuthentication", "No rx challenge! Cannot authenticate.", (Throwable) null);
                        l2f.A08.invoke(new KLm(LAk.A03));
                        break;
                    }
                }
                break;
        }
        A00 = 04S.A00;
        return A00;
    }
}
