/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.baas.model.v20180731;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateChannelRequest extends RpcAcsRequest<CreateChannelResponse> {
	
	public CreateChannelRequest() {
		super("Baas", "2018-07-31", "CreateChannel");
	}

	private List<Organization> organizations;

	private String channelName;

	private String consortiumId;

	public List<Organization> getOrganizations() {
		return this.organizations;
	}

	public void setOrganizations(List<Organization> organizations) {
		this.organizations = organizations;	
		if (organizations != null) {
			for (int depth1 = 0; depth1 < organizations.size(); depth1++) {
				putQueryParameter("Organization." + (depth1 + 1) + ".Id" , organizations.get(depth1).getId());
			}
		}	
	}

	public String getChannelName() {
		return this.channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
		if(channelName != null){
			putQueryParameter("ChannelName", channelName);
		}
	}

	public String getConsortiumId() {
		return this.consortiumId;
	}

	public void setConsortiumId(String consortiumId) {
		this.consortiumId = consortiumId;
		if(consortiumId != null){
			putQueryParameter("ConsortiumId", consortiumId);
		}
	}

	public static class Organization {

		private String id;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Override
	public Class<CreateChannelResponse> getResponseClass() {
		return CreateChannelResponse.class;
	}

}
