/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.sandegotour;


public class Word {

    private int mNameId;

    private int mDescriptionId;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(int nameId, int descriptionId) {
        mNameId = nameId;
        mDescriptionId = descriptionId;
    }

    public Word(int nameId, int descriptionId, int imageResourceId) {
        mNameId = nameId;
        mDescriptionId = descriptionId;
        mImageResourceId = imageResourceId;
    }

    public int getNameId() {
        return mNameId;
    }

    public int getDescriptionId() {
        return mDescriptionId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}