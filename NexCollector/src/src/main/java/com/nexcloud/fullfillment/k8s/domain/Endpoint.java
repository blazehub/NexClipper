package com.nexcloud.fullfillment.k8s.domain;
/*
* Copyright 2019 NexCloud Co.,Ltd.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

import java.util.HashMap;
import java.util.Map;

public class Endpoint {
	private Map<String, String> map;
	
	public Map<String, String> getMap() {
		if( map == null )
			map	= new HashMap<String, String>();
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	
	private Endpoint kubeletEndpoint;
	
	private Long Port;

	public Endpoint getKubeletEndpoint() {
		if( kubeletEndpoint == null )
			kubeletEndpoint = new Endpoint();
		return kubeletEndpoint;
	}

	public void setKubeletEndpoint(Endpoint kubeletEndpoint) {
		this.kubeletEndpoint = kubeletEndpoint;
	}

	public Long getPort() {
		return Port;
	}

	public void setPort(Long port) {
		Port = port;
	}
}
