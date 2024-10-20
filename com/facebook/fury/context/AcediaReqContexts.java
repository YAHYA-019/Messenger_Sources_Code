package com.facebook.fury.context;

import X.0GC;
import X.0GF;
import X.0GH;
import X.0wL;
import X.0xX;
import X.C02b;
import X.C02c;
import X.C02e;
import X.C0il;
import X.C0jw;
import com.facebook.fury.context.AcediaReqContexts;
import com.facebook.fury.context.ReqContext;
import com.facebook.fury.props.ReadableProps;
import com.facebook.fury.props.ReqChainProps;
import com.facebook.fury.props.ReqContextProps;
import com.facebook.fury.props.ReqPropsProvider;
import com.facebook.fury.props.WritableProps;
import com.facebook.jni.HybridData;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: AcediaReqContexts.class */
public class AcediaReqContexts implements ReqContextsPlugin, WritableProps {
    public static final int NOT_SET = 255;
    public final ReqContextsCallbacks mCallbacks;
    public final HybridData mHybridData;
    public final ThreadLocal mActiveContexts = new ThreadLocal();
    public final C02b mSequenceIdGenerator = new ThreadLocal();
    public final C02c mGlobalPropsReader = new C02c(this, 0);
    public final C02c mLocalPropsReader = new C02c(this, 1);
    public final C02e mFromReqContextReader = new ReqContext() { // from class: X.02e
        @Override // com.facebook.fury.context.ReqContext, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // com.facebook.fury.context.ReqContext
        public boolean getBoolean(int i, boolean z, int i2) {
            boolean nativeFromReqContextBooleanProp;
            nativeFromReqContextBooleanProp = AcediaReqContexts.this.nativeFromReqContextBooleanProp(i, z, i2);
            return nativeFromReqContextBooleanProp;
        }

        @Override // com.facebook.fury.context.ReqContext
        public int getCurrentSeqId() {
            int nativeFromReqContextCurrentSeqId;
            nativeFromReqContextCurrentSeqId = AcediaReqContexts.this.nativeFromReqContextCurrentSeqId();
            return nativeFromReqContextCurrentSeqId;
        }

        @Override // com.facebook.fury.context.ReqContext
        public long getCurrentTid() {
            long nativeFromReqContextCurrentTid;
            nativeFromReqContextCurrentTid = AcediaReqContexts.this.nativeFromReqContextCurrentTid();
            return nativeFromReqContextCurrentTid;
        }

        @Override // com.facebook.fury.context.ReqContext
        public int getInt(int i, int i2, int i3) {
            int nativeFromReqContextIntProp;
            nativeFromReqContextIntProp = AcediaReqContexts.this.nativeFromReqContextIntProp(i, i2, i3);
            return nativeFromReqContextIntProp;
        }

        @Override // com.facebook.fury.context.ReqContext
        public long getLong(int i, long j, int i2) {
            long nativeFromReqContextLongProp;
            nativeFromReqContextLongProp = AcediaReqContexts.this.nativeFromReqContextLongProp(i, j, i2);
            return nativeFromReqContextLongProp;
        }

        @Override // com.facebook.fury.context.ReqContext
        public Object getObject(int i, int i2) {
            return null;
        }

        @Override // com.facebook.fury.context.ReqContext
        public int getParentSeqId() {
            int nativeFromReqContextParentSeqId;
            nativeFromReqContextParentSeqId = AcediaReqContexts.this.nativeFromReqContextParentSeqId();
            return nativeFromReqContextParentSeqId;
        }

        @Override // com.facebook.fury.context.ReqContext
        public long getParentTid() {
            long nativeFromReqContextParentTid;
            nativeFromReqContextParentTid = AcediaReqContexts.this.nativeFromReqContextParentTid();
            return nativeFromReqContextParentTid;
        }

        @Override // com.facebook.fury.context.ReqContext
        public String getString(int i, int i2) {
            String nativeFromReqContextStringProp;
            nativeFromReqContextStringProp = AcediaReqContexts.this.nativeFromReqContextStringProp(i, i2);
            return nativeFromReqContextStringProp;
        }

        @Override // com.facebook.fury.context.ReqContext
        public String getTag() {
            String nativeFromReqContextGetTag;
            nativeFromReqContextGetTag = AcediaReqContexts.this.nativeFromReqContextGetTag();
            return nativeFromReqContextGetTag;
        }

        @Override // com.facebook.fury.context.ReqContext
        public int getType() {
            int nativeFromReqContextType;
            nativeFromReqContextType = AcediaReqContexts.this.nativeFromReqContextType();
            return nativeFromReqContextType;
        }

        @Override // com.facebook.fury.context.ReqContext
        public Iterator globalProps() {
            return C0jn.A00;
        }

        @Override // com.facebook.fury.context.ReqContext
        public boolean hasParent() {
            boolean nativeFromReqContextHasParent;
            nativeFromReqContextHasParent = AcediaReqContexts.this.nativeFromReqContextHasParent();
            return nativeFromReqContextHasParent;
        }

        @Override // com.facebook.fury.context.ReqContext
        public boolean hasSameProps(ReqContext reqContext) {
            return false;
        }

        @Override // com.facebook.fury.context.ReqContext
        public boolean isFlagOn(int i) {
            boolean nativeFromReqContextFlagOn;
            nativeFromReqContextFlagOn = AcediaReqContexts.this.nativeFromReqContextFlagOn(i);
            return nativeFromReqContextFlagOn;
        }

        @Override // com.facebook.fury.context.ReqContext
        public Iterator localProps() {
            return C0jn.A00;
        }
    };

    static {
        C0il.A0B("fury");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.02e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.ThreadLocal, X.02b] */
    public AcediaReqContexts(ReqContextsCallbacks reqContextsCallbacks) {
        this.mCallbacks = reqContextsCallbacks;
        this.mHybridData = initHybrid(this, reqContextsCallbacks);
    }

    private boolean canEnhanceCurrentScope(int i, int i2) {
        ReqPropsProvider provideReqPropsProvider;
        AcediaReqContext activeInternal = getActiveInternal(true);
        return activeInternal == null || ((provideReqPropsProvider = this.mCallbacks.provideReqPropsProvider()) != null && provideReqPropsProvider.canEnhanceCurrentScope(activeInternal, i, i2));
    }

    private void copyProps(int i) {
        AcediaReqContext activeInternal;
        ReadableProps reqChainProps;
        ReqPropsProvider provideReqPropsProvider = this.mCallbacks.provideReqPropsProvider();
        if (provideReqPropsProvider == null || (activeInternal = getActiveInternal(false)) == null) {
            return;
        }
        if (i == 0) {
            reqChainProps = activeInternal.getReqChainProps();
        } else if (i != 1) {
            return;
        } else {
            reqChainProps = activeInternal.getReqContextProps();
        }
        provideReqPropsProvider.copyProps(reqChainProps, this);
    }

    public static ReqChainProps createChainProps(ReqPropsProvider reqPropsProvider, int i, int i2) {
        if (reqPropsProvider == null || !reqPropsProvider.shouldFillReqChainProps(i, i2)) {
            return 0wL.A00;
        }
        0GC r0 = new 0GC();
        reqPropsProvider.fillReqChainProps(r0, i, i2);
        return r0;
    }

    public static ReqContextProps createContextProps(ReqPropsProvider reqPropsProvider, ReqContext reqContext, int i, int i2) {
        if (reqPropsProvider == null || !reqPropsProvider.shouldFillReqContextProps(reqContext, i, i2)) {
            return 0GF.A00;
        }
        0GC r0 = new 0GC();
        reqPropsProvider.fillReqContextProps(r0, reqContext, i, i2);
        return r0;
    }

    private 0GH createReqContextNode(AcediaReqContext acediaReqContext, String str, int i, int i2) {
        long currentTid;
        int currentSeqId;
        long currentThreadId = this.mCallbacks.getCurrentThreadId();
        int A00 = this.mSequenceIdGenerator.A00();
        ReqPropsProvider provideReqPropsProvider = this.mCallbacks.provideReqPropsProvider();
        ReadableProps createChainProps = acediaReqContext == null ? createChainProps(provideReqPropsProvider, i, i2) : acediaReqContext.getReqChainProps();
        ReqContextProps createContextProps = createContextProps(provideReqPropsProvider, acediaReqContext, i, i2);
        if (acediaReqContext == null) {
            currentTid = -1;
            currentSeqId = -1;
        } else {
            currentTid = acediaReqContext.getCurrentTid();
            currentSeqId = acediaReqContext.getCurrentSeqId();
        }
        return new 0GH(this, createChainProps, createContextProps, str, currentSeqId, A00, i, i2, currentTid, currentThreadId);
    }

    private void fillReqChainProps(int i, int i2) {
        ReqPropsProvider provideReqPropsProvider = this.mCallbacks.provideReqPropsProvider();
        if (provideReqPropsProvider != null) {
            provideReqPropsProvider.fillReqChainProps(this, i, i2);
        }
    }

    private void fillReqContextProps(int i, int i2) {
        ReqPropsProvider provideReqPropsProvider = this.mCallbacks.provideReqPropsProvider();
        if (provideReqPropsProvider != null) {
            provideReqPropsProvider.fillReqContextProps(this, this.mFromReqContextReader, i, i2);
        }
    }

    private AcediaReqContext getActiveInternal(boolean z) {
        LinkedList linkedList = (LinkedList) this.mActiveContexts.get();
        if (linkedList == null) {
            return null;
        }
        0GH r305 = (AcediaReqContext) linkedList.peekFirst();
        if (r305 == null) {
            return null;
        }
        if (z && r305.isPlaceholder()) {
            r305 = materializePlaceholder();
            linkedList.pollFirst();
            linkedList.push(r305);
        }
        return r305;
    }

    private int getFlags() {
        AcediaReqContext activeInternal = getActiveInternal(false);
        if (activeInternal == null || activeInternal.isPlaceholder()) {
            return -1;
        }
        return activeInternal.getFlags();
    }

    private LinkedList getOrCreateReqContextsStack() {
        LinkedList linkedList = (LinkedList) this.mActiveContexts.get();
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.mActiveContexts.set(linkedList);
        }
        return linkedList;
    }

    private int getParentSeqId() {
        AcediaReqContext activeInternal = getActiveInternal(false);
        if (activeInternal == null || activeInternal.isPlaceholder()) {
            return -1;
        }
        return activeInternal.getParentSeqId();
    }

    private long getParentTid() {
        AcediaReqContext activeInternal = getActiveInternal(false);
        return (activeInternal == null || activeInternal.isPlaceholder()) ? -1 : activeInternal.getParentTid();
    }

    private String getTag() {
        AcediaReqContext activeInternal = getActiveInternal(false);
        return (activeInternal == null || activeInternal.isPlaceholder()) ? "" : activeInternal.getTag();
    }

    private int getType() {
        AcediaReqContext activeInternal = getActiveInternal(false);
        if (activeInternal == null || activeInternal.isPlaceholder()) {
            return -1;
        }
        return activeInternal.getType();
    }

    public static native HybridData initHybrid(AcediaReqContexts acediaReqContexts, ReqContextsCallbacks reqContextsCallbacks);

    private 0GH materializePlaceholder() {
        String nativeGetTag = nativeGetTag();
        long nativeGetParentTid = nativeGetParentTid();
        int nativeGetParentSeqId = nativeGetParentSeqId();
        long currentThreadId = this.mCallbacks.getCurrentThreadId();
        Number number = (Number) this.mSequenceIdGenerator.get();
        return new 0GH(this, materializeProps(this.mGlobalPropsReader), materializeProps(this.mLocalPropsReader), nativeGetTag, nativeGetParentSeqId, number == null ? -1 : number.intValue(), nativeGetFlags(), nativeGetType(), nativeGetParentTid, currentThreadId);
    }

    private ReadableProps materializeProps(C02c c02c) {
        ReqPropsProvider provideReqPropsProvider = this.mCallbacks.provideReqPropsProvider();
        if (provideReqPropsProvider == null || c02c.isEmpty()) {
            return 0GF.A00;
        }
        0GC r0 = new 0GC();
        provideReqPropsProvider.copyProps(c02c, r0);
        return r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean nativeFromReqContextBooleanProp(int i, boolean z, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeFromReqContextCurrentSeqId();

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeFromReqContextCurrentTid();

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean nativeFromReqContextFlagOn(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native String nativeFromReqContextGetTag();

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean nativeFromReqContextHasParent();

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeFromReqContextIntProp(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeFromReqContextLongProp(int i, long j, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeFromReqContextParentSeqId();

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeFromReqContextParentTid();

    /* JADX INFO: Access modifiers changed from: private */
    public native String nativeFromReqContextStringProp(int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeFromReqContextType();

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean nativeGetBooleanProp(int i, boolean z, int i2);

    private native int nativeGetFlags();

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeGetIntProp(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeGetLongProp(int i, long j, int i2);

    private native int nativeGetParentSeqId();

    private native long nativeGetParentTid();

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeGetPropCount(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native String nativeGetStringProp(int i, int i2);

    private native String nativeGetTag();

    private native int nativeGetType();

    private native void nativePopReqContext();

    private native void nativePushPlaceholder();

    private native void nativePutBooleanProp(int i, boolean z);

    private native void nativePutIntProp(int i, int i2);

    private native void nativePutLongProp(int i, long j);

    private native void nativePutStringProp(int i, String str);

    private native void nativeReset();

    private void onActivate(AcediaReqContext acediaReqContext) {
        AcediaReqContext activeInternal;
        getOrCreateReqContextsStack().push(acediaReqContext);
        if (!acediaReqContext.isPlaceholder()) {
            nativePushPlaceholder();
        }
        ReqContextLifecycleCallbacks provideLifecycleCallbacks = this.mCallbacks.provideLifecycleCallbacks();
        if (provideLifecycleCallbacks != null) {
            C0jw BGo = provideLifecycleCallbacks.BGo();
            if ((acediaReqContext.isPlaceholder() && BGo == C0jw.NONE) || (activeInternal = getActiveInternal(true)) == null) {
                return;
            }
            provideLifecycleCallbacks.onActivate(activeInternal);
        }
    }

    private void onDeactivate() {
        AcediaReqContext acediaReqContext;
        ReqContextLifecycleCallbacks provideLifecycleCallbacks;
        LinkedList linkedList = (LinkedList) this.mActiveContexts.get();
        if (linkedList == null || (acediaReqContext = (AcediaReqContext) linkedList.pollFirst()) == null || acediaReqContext.isPlaceholder() || (provideLifecycleCallbacks = this.mCallbacks.provideLifecycleCallbacks()) == null) {
            return;
        }
        provideLifecycleCallbacks.onDeactivate(acediaReqContext);
    }

    private void popReqContext() {
        onDeactivate();
    }

    private void pushPlaceHolder() {
        this.mSequenceIdGenerator.A00();
        onActivate(0xX.A00);
    }

    private boolean shouldActivateSameContext(AcediaReqContext acediaReqContext, int i, int i2, C0jw c0jw) {
        ReqPropsProvider provideReqPropsProvider;
        boolean z = false;
        if (c0jw == C0jw.COARSE && (provideReqPropsProvider = this.mCallbacks.provideReqPropsProvider()) != null && !provideReqPropsProvider.canEnhanceCurrentScope(acediaReqContext, i, i2)) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r0.shouldFillReqChainProps(r302, r303) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean shouldFillReqChainProps(int r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            com.facebook.fury.context.ReqContextsCallbacks r0 = r0.mCallbacks
            com.facebook.fury.props.ReqPropsProvider r0 = r0.provideReqPropsProvider()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L20
            r0 = r304
            r1 = r302
            r2 = r303
            boolean r0 = r0.shouldFillReqChainProps(r1, r2)
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 != 0) goto L25
        L20:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
        L25:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fury.context.AcediaReqContexts.shouldFillReqChainProps(int, int):boolean");
    }

    private boolean shouldFillReqContextProps(int i, int i2) {
        ReqPropsProvider provideReqPropsProvider;
        AcediaReqContext activeInternal = getActiveInternal(true);
        return activeInternal == null || ((provideReqPropsProvider = this.mCallbacks.provideReqPropsProvider()) != null && provideReqPropsProvider.shouldFillReqContextProps(activeInternal, i, i2));
    }

    @Override // com.facebook.fury.context.ReqContextsPlugin
    public boolean accepts(ReqContext reqContext) {
        return reqContext instanceof AcediaReqContext;
    }

    @Override // com.facebook.fury.context.ReqContextsPlugin
    public AcediaReqContext continueReqContext(AcediaReqContext acediaReqContext, String str, int i, int i2, C0jw c0jw) {
        if (shouldActivateSameContext(acediaReqContext, i, i2, c0jw)) {
            this.mSequenceIdGenerator.A00();
        } else {
            acediaReqContext = createReqContextNode(acediaReqContext, str, i, i2);
        }
        onActivate(acediaReqContext);
        return acediaReqContext;
    }

    @Override // com.facebook.fury.context.ReqContextsPlugin
    public AcediaReqContext create(String str, int i, C0jw c0jw) {
        AcediaReqContext activeInternal = getActiveInternal(true);
        if (activeInternal != null) {
            return continueReqContext(activeInternal, str, 3, i, c0jw);
        }
        0GH createReqContextNode = createReqContextNode(null, str, 3, i);
        onActivate(createReqContextNode);
        return createReqContextNode;
    }

    @Override // com.facebook.fury.context.ReqContextsPlugin
    public void deactivate(AcediaReqContext acediaReqContext) {
        if (acediaReqContext.equals(getActiveInternal(false))) {
            nativePopReqContext();
            onDeactivate();
        }
    }

    @Override // com.facebook.fury.context.ReqContextsPlugin
    public void fail(AcediaReqContext acediaReqContext, Throwable th) {
        ReqContextExtensions provideReqContextExtensions = this.mCallbacks.provideReqContextExtensions();
        if (provideReqContextExtensions != null) {
            provideReqContextExtensions.onReqContextFailure(acediaReqContext, th);
        }
    }

    @Override // com.facebook.fury.context.ReqContextsPlugin
    public AcediaReqContext getActive() {
        return getActiveInternal(true);
    }

    @Override // com.facebook.fury.context.ReqContextsPlugin
    public /* bridge */ /* synthetic */ ReqContext getActive() {
        return getActiveInternal(true);
    }

    @Override // com.facebook.fury.props.WritableProps
    public void putBoolean(int i, boolean z) {
        nativePutBooleanProp(i, z);
    }

    @Override // com.facebook.fury.props.WritableProps
    public void putInt(int i, int i2) {
        nativePutIntProp(i, i2);
    }

    @Override // com.facebook.fury.props.WritableProps
    public void putLong(int i, long j) {
        nativePutLongProp(i, j);
    }

    @Override // com.facebook.fury.props.WritableProps
    public void putObject(int i, Object obj) {
    }

    @Override // com.facebook.fury.props.WritableProps
    public void putString(int i, String str) {
        nativePutStringProp(i, str);
    }

    @Override // com.facebook.fury.context.ReqContextsPlugin
    public void reset() {
        nativeReset();
    }
}
