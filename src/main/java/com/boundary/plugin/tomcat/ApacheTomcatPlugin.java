// Copyright 2014 Boundary, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.boundary.plugin.tomcat;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.boundary.plugin.sdk.CollectorDispatcher;
import com.boundary.plugin.sdk.MeasurementSink;
import com.boundary.plugin.sdk.Plugin;
import com.boundary.plugin.sdk.PluginRunner;
import com.boundary.plugin.sdk.jmx.JMXCollector;
import com.boundary.plugin.sdk.jmx.JMXPlugin;
import com.boundary.plugin.sdk.jmx.JMXPluginConfiguration;
import com.boundary.plugin.sdk.jmx.JMXPluginConfigurationItem;
import com.boundary.plugin.sdk.jmx.MBeanMap;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ApacheTomcatPlugin extends JMXPlugin {
	
}

