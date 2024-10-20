package com.facebook.mill.immutablecursor;

import X.02L;
import X.07E;
import X.07F;
import X.11T;
import X.7zT;
import X.AbJ;
import X.AnonymousClass001;
import X.C0ty;
import X.C1A9;
import X.DKC;
import X.JR0;
import X.KxT;
import X.KxU;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mill.runtime.TypeSqlQuery;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import java.util.Arrays;
import java.util.List;

/* loaded from: TypeSqlDatabaseImpl.class */
public final class TypeSqlDatabaseImpl {
    public final SqliteHolder sqliteHolder;

    public TypeSqlDatabaseImpl(SqliteHolder sqliteHolder) {
        11T.A0F(sqliteHolder, 1);
        this.sqliteHolder = sqliteHolder;
        KxU.A00();
        KxT.A00();
    }

    private final native boolean execSQL(SqliteHolder sqliteHolder, String str, List list);

    private final native TypeSqlQuery rawQuery(SqliteHolder sqliteHolder, String str, List list);

    public void exec(String str, Object... objArr) {
        List asList;
        11T.A0H(str, objArr);
        SqliteHolder sqliteHolder = this.sqliteHolder;
        if (objArr.length == 0) {
            asList = null;
        } else {
            asList = Arrays.asList(objArr);
            11T.A0A(asList);
        }
        execSQL(sqliteHolder, str, asList);
    }

    public void exec(Object... objArr) {
        Object[] copyOf;
        11T.A0F(objArr, 0);
        int length = objArr.length;
        boolean z = !AnonymousClass001.A1O(length);
        Integer valueOf = Integer.valueOf(length);
        if (!z) {
            throw AnonymousClass001.A0L(StringFormatUtil.formatStrLocaleSafe("args must contains at least sql statement argument size = %d", valueOf));
        }
        Object obj = objArr[0];
        DKC.A1U(obj);
        String str = (String) obj;
        if (length == 1) {
            copyOf = new Object[0];
        } else {
            07E r0 = new 07E(1, length - 1);
            Object[] array = (r0.A00() ? C0ty.A00 : JR0.A0x(C1A9.A0L(objArr, ((07F) r0).A00, ((07F) r0).A01 + 1))).toArray(new Object[0]);
            copyOf = Arrays.copyOf(array, array.length);
        }
        exec(str, copyOf);
    }

    public SqliteHolder getSqliteHolder() {
        return this.sqliteHolder;
    }

    public TypeSqlQuery prepare(byte[] bArr, String str, Object... objArr) {
        7zT.A1S(bArr, str, objArr);
        TypeSqlQuery rawQuery = rawQuery(this.sqliteHolder, str, 02L.A09(objArr));
        rawQuery.setColumnTypes(bArr);
        return rawQuery;
    }

    public TypeSqlQuery prepare(Object... objArr) {
        Object[] copyOf;
        11T.A0F(objArr, 0);
        int length = objArr.length;
        boolean A1U = AbJ.A1U(length, 2);
        Integer valueOf = Integer.valueOf(length);
        if (!A1U) {
            throw AnonymousClass001.A0L(StringFormatUtil.formatStrLocaleSafe("args must contains at least sql statement and columnTypes arguments size = %d", valueOf));
        }
        Object obj = objArr[0];
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.ByteArray");
        byte[] bArr = (byte[]) obj;
        Object obj2 = objArr[1];
        DKC.A1U(obj2);
        String str = (String) obj2;
        if (length == 2) {
            copyOf = new Object[0];
        } else {
            07E r0 = new 07E(2, length - 1);
            Object[] array = (r0.A00() ? C0ty.A00 : JR0.A0x(C1A9.A0L(objArr, ((07F) r0).A00, ((07F) r0).A01 + 1))).toArray(new Object[0]);
            copyOf = Arrays.copyOf(array, array.length);
        }
        return prepare(bArr, str, copyOf);
    }
}
