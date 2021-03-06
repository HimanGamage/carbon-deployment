/*
 * Copyright (c) 2005-2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.webapp.mgt.loader;

public class LoaderConstants {

    public final static String ENV_CONFIG_FILE = "webapp-classloading-environments.xml";
    public final static String CL_CONFIG_FILE = "webapp-classloading.xml";
    public final static String APP_CL_CONFIG_FILE = "META-INF/" + CL_CONFIG_FILE;
    public final static String DEFAULT_EXT_DIR = "${carbon.home}/lib/runtimes/ext/";


    public final static String SYSTEM_ENV = "Carbon";
    public final static String TOMCAT_ENV = "Tomcat";
    public final static String CXF_ENV = "CXF";

    //TODO add all the XML element names as constants.
}
