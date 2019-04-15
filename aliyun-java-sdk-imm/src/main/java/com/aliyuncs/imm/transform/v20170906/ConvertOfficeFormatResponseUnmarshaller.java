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

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.ConvertOfficeFormatResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConvertOfficeFormatResponseUnmarshaller {

	public static ConvertOfficeFormatResponse unmarshall(ConvertOfficeFormatResponse convertOfficeFormatResponse, UnmarshallerContext context) {
		
		convertOfficeFormatResponse.setRequestId(context.stringValue("ConvertOfficeFormatResponse.RequestId"));
		convertOfficeFormatResponse.setPageCount(context.integerValue("ConvertOfficeFormatResponse.PageCount"));
	 
	 	return convertOfficeFormatResponse;
	}
}