package androidx.core.view.inputmethod;

import X.0Rd;
import X.0Re;
import X.AnonymousClass001;
import X.C0Ad;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: InputConnectionCompat.class */
public final class InputConnectionCompat {
    public static final String COMMIT_CONTENT_ACTION = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    public static final String COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    public static final String COMMIT_CONTENT_CONTENT_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    public static final String COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    public static final String COMMIT_CONTENT_DESCRIPTION_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    public static final String COMMIT_CONTENT_FLAGS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    public static final String COMMIT_CONTENT_FLAGS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    public static final String COMMIT_CONTENT_INTEROP_ACTION = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    public static final String COMMIT_CONTENT_LINK_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    public static final String COMMIT_CONTENT_LINK_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    public static final String COMMIT_CONTENT_OPTS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    public static final String COMMIT_CONTENT_OPTS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    public static final String COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    public static final String COMMIT_CONTENT_RESULT_RECEIVER_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    public static final String EXTRA_INPUT_CONTENT_INFO = "androidx.core.view.extra.INPUT_CONTENT_INFO";
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;
    public static final String LOG_TAG = "InputConnectionCompat";

    /* renamed from: androidx.core.view.inputmethod.InputConnectionCompat$1 */
    /* loaded from: InputConnectionCompat$1.class */
    public class AnonymousClass1 extends InputConnectionWrapper {
        public final /* synthetic */ OnCommitContentListener val$listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InputConnection inputConnection, boolean z, OnCommitContentListener onCommitContentListener) {
            super(inputConnection, z);
            r304 = onCommitContentListener;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (r304.onCommitContent(InputContentInfoCompat.wrap(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: androidx.core.view.inputmethod.InputConnectionCompat$2 */
    /* loaded from: InputConnectionCompat$2.class */
    public class AnonymousClass2 extends InputConnectionWrapper {
        public final /* synthetic */ OnCommitContentListener val$listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InputConnection inputConnection, boolean z, OnCommitContentListener onCommitContentListener) {
            super(inputConnection, z);
            this.val$listener = onCommitContentListener;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (InputConnectionCompat.handlePerformPrivateCommand(str, bundle, this.val$listener)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* loaded from: InputConnectionCompat$Api25Impl.class */
    public class Api25Impl {
        public static boolean commitContent(InputConnection inputConnection, InputContentInfo inputContentInfo, int i, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* loaded from: InputConnectionCompat$OnCommitContentListener.class */
    public interface OnCommitContentListener {
        boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle);
    }

    public static boolean commitContent(InputConnection inputConnection, EditorInfo editorInfo, InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        return inputConnection.commitContent((InputContentInfo) inputContentInfoCompat.mImpl.getInputContentInfo(), i, bundle);
    }

    public static OnCommitContentListener createOnCommitContentListenerUsingPerformReceiveContent(View view) {
        view.getClass();
        return new InputConnectionCompat$$ExternalSyntheticLambda0(view);
    }

    public static InputConnection createWrapper(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        view.getClass();
        return createWrapper(inputConnection, editorInfo, new InputConnectionCompat$$ExternalSyntheticLambda0(view));
    }

    public static InputConnection createWrapper(InputConnection inputConnection, EditorInfo editorInfo, OnCommitContentListener onCommitContentListener) {
        if (inputConnection == null) {
            throw AnonymousClass001.A0Q("inputConnection must be non-null");
        }
        if (editorInfo == null) {
            throw AnonymousClass001.A0Q("editorInfo must be non-null");
        }
        if (onCommitContentListener != null) {
            return new InputConnectionWrapper(inputConnection, false) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.1
                public final /* synthetic */ OnCommitContentListener val$listener;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(InputConnection inputConnection2, boolean z, OnCommitContentListener onCommitContentListener2) {
                    super(inputConnection2, z);
                    r304 = onCommitContentListener2;
                }

                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
                    if (r304.onCommitContent(InputContentInfoCompat.wrap(inputContentInfo), i, bundle)) {
                        return true;
                    }
                    return super.commitContent(inputContentInfo, i, bundle);
                }
            };
        }
        throw AnonymousClass001.A0Q("onCommitContentListener must be non-null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean handlePerformPrivateCommand(String str, Bundle bundle, OnCommitContentListener onCommitContentListener) {
        byte b;
        ResultReceiver resultReceiver;
        boolean z = false;
        if (bundle != null) {
            if (TextUtils.equals(COMMIT_CONTENT_ACTION, str)) {
                b = false;
            } else if (TextUtils.equals(COMMIT_CONTENT_INTEROP_ACTION, str)) {
                b = true;
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(b != false ? COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY : COMMIT_CONTENT_RESULT_RECEIVER_KEY);
            } catch (Throwable th) {
                th = th;
            }
            try {
                Uri uri = (Uri) bundle.getParcelable(b != false ? COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY : COMMIT_CONTENT_CONTENT_URI_KEY);
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(b != false ? COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY : COMMIT_CONTENT_DESCRIPTION_KEY);
                Uri uri2 = (Uri) bundle.getParcelable(b != false ? COMMIT_CONTENT_LINK_URI_INTEROP_KEY : COMMIT_CONTENT_LINK_URI_KEY);
                int i = bundle.getInt(b != false ? COMMIT_CONTENT_FLAGS_INTEROP_KEY : COMMIT_CONTENT_FLAGS_KEY);
                Bundle bundle2 = (Bundle) bundle.getParcelable(b != false ? COMMIT_CONTENT_OPTS_INTEROP_KEY : COMMIT_CONTENT_OPTS_KEY);
                if (uri != null && clipDescription != null) {
                    z = onCommitContentListener.onCommitContent(new InputContentInfoCompat(uri, clipDescription, uri2), i, bundle2);
                }
                if (resultReceiver != null) {
                    resultReceiver.send(z ? 1 : 0, null);
                    return z;
                }
            } finally {
                th = th;
                if (resultReceiver != null) {
                }
                throw th;
            }
        }
        return z;
    }

    public static /* synthetic */ boolean lambda$createOnCommitContentListenerUsingPerformReceiveContent$0(View view, InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        boolean z = false;
        if ((i & 1) != 0) {
            try {
                inputContentInfoCompat.requestPermission();
                Parcelable parcelable = (Parcelable) inputContentInfoCompat.mImpl.getInputContentInfo();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable(EXTRA_INPUT_CONTENT_INFO, parcelable);
            } catch (Exception e) {
                Log.w(LOG_TAG, "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        0Rd r0 = new 0Rd(new ClipData(inputContentInfoCompat.mImpl.getDescription(), new ClipData.Item(inputContentInfoCompat.mImpl.getContentUri())), 2);
        Uri linkUri = inputContentInfoCompat.mImpl.getLinkUri();
        0Re r02 = r0.A00;
        r02.CqY(linkUri);
        r02.setExtras(bundle);
        if (C0Ad.A02(view, r02.ACd()) == null) {
            z = true;
        }
        return z;
    }
}
