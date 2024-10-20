package com.facebook.xapp.messaging.composer.broadcast.transportagnostic.attachment.source;

import X.0Pz;
import X.0RF;
import X.0fH;
import X.11T;
import X.1Bi;
import X.1Bn;
import X.1CO;
import X.1EZ;
import X.1Fv;
import X.1GD;
import X.2BQ;
import X.2yD;
import X.3zA;
import X.69B;
import X.69C;
import X.AnonymousClass001;
import X.AnonymousClass046;
import X.AnonymousClass047;
import X.AnonymousClass053;
import X.C00i;
import X.C00j;
import X.C03853z9;
import X.C0A2;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.msys.mca.MailboxHealthReport;
import com.facebook.secure.content.SecureContentDelegateDI;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

/* loaded from: TamAttachmentProvider.class */
public final class TamAttachmentProvider extends 0RF {
    public static final String[] A00 = {"path"};

    /* loaded from: TamAttachmentProvider$Impl.class */
    public final class Impl extends SecureContentDelegateDI {
        public final C00i A00;
        public final C00i A01;
        public final C00i A02;
        public final C00i A03;
        public final C00i A04;

        public Impl(0RF r302) {
            super(r302);
            this.A03 = 1Bi.A01(C03853z9.class);
            this.A01 = 1Bi.A01(1CO.class);
            this.A04 = 1Bn.A02();
            this.A00 = 1Bi.A01(2BQ.class);
            this.A02 = 1Bi.A01(3zA.class);
        }

        private 69C A00(Uri uri, FbUserSession fbUserSession) {
            69C A00;
            String str;
            String str2;
            C00i c00i = this.A03;
            c00i.get();
            long A002 = C03853z9.A00(uri);
            c00i.get();
            11T.A0F(uri, 0);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() >= 2 && (str = pathSegments.get(1)) != null) {
                boolean AZr = ((2yD) this.A01.get()).AZr(1GD.A07, 36324569943854846L);
                c00i.get();
                String queryParameter = uri.getQueryParameter("rl");
                int parseInt = queryParameter != null ? Integer.parseInt(queryParameter) : 2;
                69C A01 = A01(fbUserSession, str, parseInt, A002, AZr);
                if (!A01.A04()) {
                    c00i.get();
                    List<String> pathSegments2 = uri.getPathSegments();
                    if (pathSegments2.size() >= 3 && (str2 = pathSegments2.get(2)) != null) {
                        A00 = A01(fbUserSession, str2, parseInt, A002, AZr);
                        A05(Boolean.valueOf(AZr), null, Integer.valueOf(parseInt), 0Pz.A0W("Resolve attachment from secondary content token : ", A00.A04() ? OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS : OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE), A01.A03());
                    }
                }
                return A01;
            }
            A00 = 69C.A00("Uri does not contain primary content token");
            return A00;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0083, code lost:
        
            if (((X.2yD) r0.get()).AZk(36310675732824970L) == false) goto L6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private X.69C A01(com.facebook.auth.usersession.FbUserSession r302, java.lang.String r303, int r304, long r305, boolean r307) {
            /*
                Method dump skipped, instructions count: 526
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.xapp.messaging.composer.broadcast.transportagnostic.attachment.source.TamAttachmentProvider.Impl.A01(com.facebook.auth.usersession.FbUserSession, java.lang.String, int, long, boolean):X.69C");
        }

        public static String A02(MailboxHealthReport mailboxHealthReport) {
            StringBuilder A0k = AnonymousClass001.A0k();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= mailboxHealthReport.getAllErrors().size()) {
                    return A0k.toString();
                }
                A0k.append("#");
                int i3 = i2 + 1;
                A0k.append(i3);
                A0k.append(". Error code = ");
                A0k.append(mailboxHealthReport.getAllErrors().get(i2));
                if (mailboxHealthReport.getAllExtendedErrors().size() > i2) {
                    A0k.append(" Extended error code = ");
                    A0k.append(mailboxHealthReport.getAllExtendedErrors().get(i2));
                }
                A0k.append(';');
                i = i3;
            }
        }

        public static String A03(69B r301) {
            if (!r301.A05) {
                String format = String.format("TAM failure: resolutionCode = %1s, errorCode = %2s, reason = RCT result is failure", r301.A03, r301.A02);
                0fH.A0n("TamAttachmentProvider", 0Pz.A0W("Failed to get file path - ", format));
                throw new FileNotFoundException(format);
            }
            String str = r301.A04;
            if (str != null) {
                0fH.A0n("TamAttachmentProvider", "Resolve content token succeeded");
                return str;
            }
            String format2 = String.format("TAM failure: resolutionCode = %1s, errorCode = %2s, reason = file path is null", r301.A03, r301.A02);
            0fH.A0n("TamAttachmentProvider", "Failed to get file path: File path is null");
            throw new FileNotFoundException(format2);
        }

        private void A04(long j, String str, int i) {
            ((3zA) this.A02.get()).A00(j, str, i);
        }

        private void A05(Boolean bool, Exception exc, Integer num, String str, String str2) {
            AnonymousClass047 ACu = ((AnonymousClass046) this.A04.get()).ACu(str, 817898717);
            if (exc != null) {
                ACu.Cmr(exc);
            }
            if (str2 != null) {
                ACu.A8K("errorMessage", str2);
            }
            if (num != null) {
                ACu.A8I("requestLevel", num.intValue());
            }
            if (bool != null) {
                ACu.A8L("hasRetryFix", bool.booleanValue());
            }
            ACu.report();
            0fH.A0n("TamAttachmentProvider", 0Pz.A0v("Failed to resolve content token - ", str, " - ", str2));
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0U(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            return 0;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0V(Uri uri, String str, String[] strArr) {
            return 0;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public AssetFileDescriptor A0W(Uri uri, String str, Bundle bundle) {
            Throwable th;
            C00j.A05("TamAttachmentProvider.doOpenTypedAssetFile", -249698432);
            try {
                0RF r0 = ((AnonymousClass053) this).A00;
                69C A00 = A00(uri, 1Fv.A02((1EZ) 1Bn.A0C(r0.getContext())));
                String A03 = A00.A03();
                if (A03 != null) {
                    A05(null, null, null, A03, null);
                }
                if (A00.A04()) {
                    Context context = r0.getContext();
                    String str2 = (String) A00.A02();
                    Uri uri2 = null;
                    try {
                        uri2 = C0A2.A03(str2);
                    } catch (SecurityException unused) {
                    }
                    if (uri2 == null) {
                        new FileNotFoundException("path is invalid");
                    } else if (!"content".equals(uri2.getScheme()) || context == null) {
                        if (uri2.getPath() != null) {
                            str2 = uri2.getPath();
                        }
                        try {
                            new AssetFileDescriptor(ParcelFileDescriptor.open(new File(str2), 268435456), 0L, -1);
                            C00j.A01(-1157851688);
                            return r305;
                        } catch (FileNotFoundException e) {
                            new FileNotFoundException(0Pz.A1B("ParcelFileDescriptor.open : ", e));
                        }
                    } else {
                        try {
                            AssetFileDescriptor assetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri2, "r");
                            C00j.A01(-1157851688);
                            return assetFileDescriptor;
                        } catch (FileNotFoundException e2) {
                            new FileNotFoundException(0Pz.A1B("ContentResolver.openAssetFileDescriptor : ", e2));
                        }
                    }
                } else {
                    A03.getClass();
                    new FileNotFoundException(A03);
                }
                throw th;
            } catch (Throwable th2) {
                C00j.A01(61687502);
                throw th2;
            }
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Cursor A0X(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            try {
                69C A00 = A00(uri, 1Fv.A02((1EZ) 1Bn.A0C(((AnonymousClass053) this).A00.getContext())));
                String A03 = A00.A03();
                if (A03 != null) {
                    A05(null, null, null, A03, null);
                }
                if (!A00.A04()) {
                    return null;
                }
                MatrixCursor matrixCursor = new MatrixCursor(TamAttachmentProvider.A00);
                matrixCursor.addRow(Arrays.asList((String) A00.A02()));
                return matrixCursor;
            } catch (FileNotFoundException e) {
                A05(null, e, null, "File not found for file path", null);
                return null;
            }
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Uri A0Y(Uri uri, ContentValues contentValues) {
            return null;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public String A0a(Uri uri) {
            return null;
        }
    }
}
