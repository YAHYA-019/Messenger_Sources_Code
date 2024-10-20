package com.facebook.forker;

import X.0eB;
import X.AnonymousClass001;
import android.content.Context;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: ProcessBuilder.class */
public final class ProcessBuilder implements Cloneable {
    public static final String TAG = "fb-ProcessBuilder";
    public ArrayList mArgv;
    public byte[] mEnvironCache;
    public ArrayList mEnvironKeys;
    public ArrayList mEnvironValues;
    public String mExecutable;
    public BitSet mKeepFds;
    public int[] mStreamDispositions;
    public File mTmpDir;

    public ProcessBuilder() {
        int indexOf;
        this.mArgv = AnonymousClass001.A0s();
        BitSet bitSet = new BitSet();
        this.mKeepFds = bitSet;
        this.mStreamDispositions = new int[]{-3, -3, -3};
        bitSet.set(0);
        BitSet bitSet2 = this.mKeepFds;
        bitSet2.set(1);
        bitSet2.set(2);
        String str = System.getenv("ANDROID_PROPERTY_WORKSPACE");
        if (str == null || (indexOf = str.indexOf(44)) == -1) {
            return;
        }
        try {
            this.mKeepFds.set(Integer.parseInt(str.substring(0, indexOf)));
        } catch (NumberFormatException e) {
            Log.d(TAG, "cannot parse property workspace FD", e);
        }
    }

    public ProcessBuilder(String str, String... strArr) {
        this();
        this.mExecutable = str;
        ArrayList arrayList = this.mArgv;
        arrayList.add(str);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= strArr.length) {
                return;
            }
            arrayList.add(strArr[i2]);
            i = i2 + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, com.facebook.forker.UnsafeByteArrayOutputStream] */
    public static byte[] buildEnvironBlock(ArrayList arrayList, ArrayList arrayList2) {
        Object obj;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            obj = i;
            if (obj >= size) {
                try {
                    break;
                } catch (IOException unused) {
                    throw AnonymousClass001.A0J(obj);
                }
            }
            i2 += ((String) arrayList.get(i)).length() + 1 + ((String) arrayList2.get(i)).length() + 1;
            i++;
        }
        ?? byteArrayOutputStream = new ByteArrayOutputStream(i2);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream));
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= size) {
                bufferedWriter.flush();
                obj = byteArrayOutputStream.getRawBuffer();
                return obj;
            }
            bufferedWriter.write((String) arrayList.get(i4));
            bufferedWriter.write(61);
            bufferedWriter.write((String) arrayList2.get(i4));
            bufferedWriter.write(0);
            i3 = i4 + 1;
        }
    }

    public static File genDefaultTmpDir(Context context) {
        File A00 = 0eB.A00(context, SC.android_fbapps_forker_tempdir);
        A00.mkdirs();
        return A00;
    }

    public static int[] getArrayOfSetBits(BitSet bitSet) {
        int[] iArr = new int[bitSet.cardinality()];
        int i = 0;
        int nextSetBit = bitSet.nextSetBit(0);
        while (nextSetBit != -1) {
            iArr[i] = nextSetBit;
            nextSetBit = bitSet.nextSetBit(nextSetBit + 1);
            i++;
        }
        return iArr;
    }

    private byte[] makeEnvironBlock() {
        ArrayList arrayList = this.mEnvironKeys;
        if (arrayList != null && this.mEnvironCache == null) {
            this.mEnvironCache = buildEnvironBlock(arrayList, this.mEnvironValues);
        }
        return this.mEnvironCache;
    }

    public ProcessBuilder addArgument(String str) {
        this.mArgv.add(str);
        return this;
    }

    public ProcessBuilder addArguments(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            addArgument(AnonymousClass001.A0i(it));
        }
        return this;
    }

    public ProcessBuilder addArguments(String... strArr) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= strArr.length) {
                return this;
            }
            this.mArgv.add(strArr[i2]);
            i = i2 + 1;
        }
    }

    public ProcessBuilder clearenv() {
        ArrayList arrayList = this.mEnvironKeys;
        if (arrayList == null) {
            this.mEnvironKeys = AnonymousClass001.A0s();
            this.mEnvironValues = AnonymousClass001.A0s();
            return this;
        }
        arrayList.clear();
        this.mEnvironValues.clear();
        this.mEnvironCache = null;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.forker.ProcessBuilder] */
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ProcessBuilder m6091clone() {
        Object makeEnvironBlock = makeEnvironBlock();
        try {
            makeEnvironBlock = (ProcessBuilder) super.clone();
            makeEnvironBlock.mArgv = (ArrayList) this.mArgv.clone();
            makeEnvironBlock.mKeepFds = (BitSet) this.mKeepFds.clone();
            makeEnvironBlock.mStreamDispositions = (int[]) this.mStreamDispositions.clone();
            ArrayList arrayList = this.mEnvironKeys;
            if (arrayList != null) {
                makeEnvironBlock.mEnvironKeys = (ArrayList) arrayList.clone();
                makeEnvironBlock.mEnvironValues = (ArrayList) this.mEnvironValues.clone();
            }
            byte[] bArr = this.mEnvironCache;
            if (bArr != null) {
                makeEnvironBlock.mEnvironCache = (byte[]) bArr.clone();
            }
            makeEnvironBlock.mTmpDir = this.mTmpDir;
            return makeEnvironBlock;
        } catch (CloneNotSupportedException unused) {
            throw AnonymousClass001.A0J(makeEnvironBlock);
        }
    }

    public Process create() {
        int i = Process.FD_STREAM_INPUT;
        String str = this.mExecutable;
        ArrayList arrayList = this.mArgv;
        return new Process(str, (String[]) arrayList.toArray(new String[arrayList.size()]), makeEnvironBlock(), getArrayOfSetBits(this.mKeepFds), this.mStreamDispositions, this.mTmpDir);
    }

    public void freezeEnviron() {
        if (this.mEnvironKeys == null) {
            Map<String, String> map = System.getenv();
            int size = map.size();
            ArrayList A0t = AnonymousClass001.A0t(size);
            ArrayList A0t2 = AnonymousClass001.A0t(size);
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                A0t.add(A0z.getKey());
                A0t2.add(A0z.getValue());
            }
            this.mEnvironKeys = A0t;
            this.mEnvironValues = A0t2;
        }
    }

    public ProcessBuilder setExecutable(String str) {
        this.mExecutable = str;
        return this;
    }

    public ProcessBuilder setFdCloseOnExec(int i, boolean z) {
        BitSet bitSet = this.mKeepFds;
        if (z) {
            bitSet.clear(i);
            return this;
        }
        bitSet.set(i);
        return this;
    }

    public ProcessBuilder setStream(int i, int i2) {
        this.mStreamDispositions[i] = i2;
        return this;
    }

    public ProcessBuilder setTmpDir(File file) {
        this.mTmpDir = file;
        return this;
    }

    public ProcessBuilder setenv(String str, String str2) {
        if (str.indexOf(0) != -1 || str2.indexOf(0) != -1) {
            throw AnonymousClass001.A0L("environment variables cannot contain NUL");
        }
        if (str.indexOf(61) != -1) {
            throw AnonymousClass001.A0L("environment variable names cannot contain '='");
        }
        unsetenv(str);
        this.mEnvironKeys.add(str);
        this.mEnvironValues.add(str2);
        this.mEnvironCache = null;
        return this;
    }

    public String toString() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.format("<ProcessBuilder executable=[%s] argv=[", this.mExecutable);
        for (int i = 0; i < this.mArgv.size(); i++) {
            if (i > 0) {
                printWriter.print(" ");
            }
            printWriter.print((String) this.mArgv.get(i));
        }
        printWriter.format("] keepFds=[%s] streamDispositions=[%s]", Arrays.toString(getArrayOfSetBits(this.mKeepFds)), Arrays.toString(this.mStreamDispositions));
        printWriter.print(">");
        return stringWriter.toString();
    }

    public ProcessBuilder unsetenv(String str) {
        freezeEnviron();
        ArrayList arrayList = this.mEnvironKeys;
        ArrayList arrayList2 = this.mEnvironValues;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                break;
            }
            if (str.equals(arrayList.get(i2))) {
                this.mEnvironCache = null;
                arrayList.remove(i2);
                arrayList2.remove(i2);
                break;
            }
            i = i2 + 1;
        }
        return this;
    }
}
