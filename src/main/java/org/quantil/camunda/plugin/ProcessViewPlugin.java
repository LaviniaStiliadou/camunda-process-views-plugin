/*
 * Copyright (c) 2023 Institute of Architecture of Application Systems -
 * University of Stuttgart
 *
 * This program and the accompanying materials are made available under the
 * terms the Apache Software License 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.quantil.camunda.plugin;

import java.util.HashSet;
import java.util.Set;

import org.camunda.bpm.cockpit.plugin.spi.impl.AbstractCockpitPlugin;
import org.quantil.camunda.plugin.resources.ProcessViewPluginRootResource;

/**
 * Main class of the server-side plugin
 */
public class ProcessViewPlugin extends AbstractCockpitPlugin {

    public static final String ID = "camunda-process-views-plugin";

    public String getId() {
        return ID;
    }

    @Override
    public Set<Class<?>> getResourceClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();

        classes.add(ProcessViewPluginRootResource.class);

        return classes;
    }
}
