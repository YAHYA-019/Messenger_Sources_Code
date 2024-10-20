package androidx.compose.foundation.gestures;

import X.04S;
import X.0CL;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0Ml;
import X.2aI;
import X.7zO;
import X.AnonymousClass001;
import X.C0Bd;
import X.KMa;
import X.Kts;
import X.LE0;
import X.MNe;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: TapGestureDetectorKt$detectTapGestures$2$1.class */
public final class TapGestureDetectorKt$detectTapGestures$2$1 extends 0Ml implements Function2 {
    public final /* synthetic */ 2aI $$this$coroutineScope;
    public final /* synthetic */ Function1 $onDoubleTap;
    public final /* synthetic */ Function1 $onLongPress;
    public final /* synthetic */ C0Bd $onPress;
    public final /* synthetic */ Function1 $onTap;
    public final /* synthetic */ PressGestureScopeImpl $pressScope;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3, reason: invalid class name */
    /* loaded from: TapGestureDetectorKt$detectTapGestures$2$1$3.class */
    public final class AnonymousClass3 extends 0Ml implements Function2 {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass3(0DR r302) {
            super(2, r302);
        }

        public final 0DR create(Object obj, 0DR r303) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(r303);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3((0DR) obj2);
            anonymousClass3.L$0 = obj;
            return anonymousClass3.invokeSuspend(04S.A00);
        }

        public final Object invokeSuspend(Object obj) {
            0Ds r0 = 0Ds.A02;
            int i = this.label;
            if (i == 0) {
                0Dt.A00(obj);
                MNe mNe = (MNe) this.L$0;
                this.label = 1;
                obj = TapGestureDetectorKt.A00(mNe, KMa.A03, this);
                if (obj == r0) {
                    return r0;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0M();
                }
                0Dt.A00(obj);
            }
            return obj;
        }
    }

    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9, reason: invalid class name */
    /* loaded from: TapGestureDetectorKt$detectTapGestures$2$1$9.class */
    public final class AnonymousClass9 extends 0Ml implements Function2 {
        public final /* synthetic */ 2aI $$this$coroutineScope;
        public final /* synthetic */ Function1 $onDoubleTap;
        public final /* synthetic */ Function1 $onTap;
        public final /* synthetic */ PressGestureScopeImpl $pressScope;
        public final /* synthetic */ 0CL $upOrCancel;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(PressGestureScopeImpl pressGestureScopeImpl, 0DR r303, Function1 function1, Function1 function12, 0CL r306, 2aI r307) {
            super(2, r303);
            this.$$this$coroutineScope = r307;
            this.$onDoubleTap = function1;
            this.$onTap = function12;
            this.$upOrCancel = r306;
            this.$pressScope = pressGestureScopeImpl;
        }

        public final 0DR create(Object obj, 0DR r303) {
            2aI r0 = this.$$this$coroutineScope;
            AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.$pressScope, r303, this.$onDoubleTap, this.$onTap, this.$upOrCancel, r0);
            anonymousClass9.L$0 = obj;
            return anonymousClass9;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
        }

        public final Object invokeSuspend(Object obj) {
            0Ds r0 = 0Ds.A02;
            int i = this.label;
            04S r306 = null;
            if (i == 0) {
                0Dt.A00(obj);
                MNe mNe = (MNe) this.L$0;
                this.label = 1;
                obj = TapGestureDetectorKt.A00(mNe, KMa.A03, this);
                if (obj == r0) {
                    return r0;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0M();
                }
                0Dt.A00(obj);
            }
            Kts kts = (Kts) obj;
            if (kts == null) {
                7zO.A1W(this.$pressScope, this.$$this$coroutineScope, 16);
                Function1 function1 = this.$onTap;
                if (function1 != null) {
                    LE0.A08((Kts) this.$upOrCancel.element, function1);
                }
                return r306;
            }
            kts.A00();
            7zO.A1W(this.$pressScope, this.$$this$coroutineScope, 15);
            LE0.A08(kts, this.$onDoubleTap);
            r306 = 04S.A00;
            return r306;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapGestures$2$1(PressGestureScopeImpl pressGestureScopeImpl, 0DR r303, Function1 function1, Function1 function12, Function1 function13, C0Bd c0Bd, 2aI r308) {
        super(2, r303);
        this.$$this$coroutineScope = r308;
        this.$onPress = c0Bd;
        this.$onLongPress = function1;
        this.$onDoubleTap = function12;
        this.$onTap = function13;
        this.$pressScope = pressGestureScopeImpl;
    }

    public final 0DR create(Object obj, 0DR r303) {
        2aI r0 = this.$$this$coroutineScope;
        C0Bd c0Bd = this.$onPress;
        TapGestureDetectorKt$detectTapGestures$2$1 tapGestureDetectorKt$detectTapGestures$2$1 = new TapGestureDetectorKt$detectTapGestures$2$1(this.$pressScope, r303, this.$onLongPress, this.$onDoubleTap, this.$onTap, c0Bd, r0);
        tapGestureDetectorKt$detectTapGestures$2$1.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0350, code lost:
    
        if (r305 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006e, code lost:
    
        if (r303 == r0) goto L8;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b7 A[Catch: Lym -> 0x01fc, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Lym -> 0x01fc, blocks: (B:36:0x01a9, B:38:0x01af, B:41:0x01b7, B:42:0x01be, B:44:0x01cd, B:88:0x01d5, B:89:0x01da, B:91:0x01e0, B:92:0x01e5, B:94:0x01f4), top: B:35:0x01a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d5 A[Catch: Lym -> 0x01fc, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Lym -> 0x01fc, blocks: (B:36:0x01a9, B:38:0x01af, B:41:0x01b7, B:42:0x01be, B:44:0x01cd, B:88:0x01d5, B:89:0x01da, B:91:0x01e0, B:92:0x01e5, B:94:0x01f4), top: B:35:0x01a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0213  */
    /* JADX WARN: Type inference failed for: r0v134, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r320v12 */
    /* JADX WARN: Type inference failed for: r320v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r320v16 */
    /* JADX WARN: Type inference failed for: r320v2 */
    /* JADX WARN: Type inference failed for: r320v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
