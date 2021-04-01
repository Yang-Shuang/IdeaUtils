package com.yang;
/*
 * Copyright (C) 2008 The Android Open Source Project
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

/**
 * Generates IntelliJ and Eclipse project configurations.
 */
public class Main {

    // 工具路径（本项目路径）
    private static final String TOOL_PATH = "/System/Volumes/Data/work/workSpace/IdeaProjects/Demo/IdeaUtils";
    // 要扫描的root
    private static final String CODE_ROOT = "/System/Volumes/Data/work/workSpace/Sources/Android4.0";

    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration(TOOL_PATH, CODE_ROOT);
        IntelliJ.generateFrom(configuration, CODE_ROOT);
//        Eclipse.generateFrom(configuration);
    }
}
