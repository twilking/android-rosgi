/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.dx.cf.iface;

import com.android.dx.rop.cst.CstNat;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.cst.CstUtf8;

/**
 * Interface representing members of class files (that is, fields and methods).
 */
public interface Member {
    /**
     * Get the defining class.
     *
     * @return non-null; the defining class
     */
    public CstType getDefiningClass();

    /**
     * Get the field <code>access_flags</code>.
     *
     * @return the access flags
     */
    public int getAccessFlags();

    /**
     * Get the field <code>name_index</code> of the member. This is
     * just a convenient shorthand for <code>getNat().getName()</code>.
     *
     * @return non-null; the name
     */
    public CstUtf8 getName();

    /**
     * Get the field <code>descriptor_index</code> of the member. This is
     * just a convenient shorthand for <code>getNat().getDescriptor()</code>.
     *
     * @return non-null; the descriptor
     */
    public CstUtf8 getDescriptor();

    /**
     * Get the name and type associated with this member. This is a
     * combination of the fields <code>name_index</code> and
     * <code>descriptor_index</code> in the original classfile, interpreted
     * via the constant pool.
     *
     * @return non-null; the name and type
     */
    public CstNat getNat();

    /**
     * Get the field <code>attributes</code> (along with
     * <code>attributes_count</code>).
     *
     * @return non-null; the constant pool
     */
    public AttributeList getAttributes();
}
