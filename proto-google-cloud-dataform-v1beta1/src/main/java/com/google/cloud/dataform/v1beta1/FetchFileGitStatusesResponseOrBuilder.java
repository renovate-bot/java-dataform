/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1beta1/dataform.proto

package com.google.cloud.dataform.v1beta1;

public interface FetchFileGitStatusesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.FetchFileGitStatusesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of all files which have uncommitted Git changes. There will only be
   * a single entry for any given file.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1beta1.FetchFileGitStatusesResponse.UncommittedFileChange uncommitted_file_changes = 1;
   * </code>
   */
  java.util.List<
          com.google.cloud.dataform.v1beta1.FetchFileGitStatusesResponse.UncommittedFileChange>
      getUncommittedFileChangesList();
  /**
   *
   *
   * <pre>
   * A list of all files which have uncommitted Git changes. There will only be
   * a single entry for any given file.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1beta1.FetchFileGitStatusesResponse.UncommittedFileChange uncommitted_file_changes = 1;
   * </code>
   */
  com.google.cloud.dataform.v1beta1.FetchFileGitStatusesResponse.UncommittedFileChange
      getUncommittedFileChanges(int index);
  /**
   *
   *
   * <pre>
   * A list of all files which have uncommitted Git changes. There will only be
   * a single entry for any given file.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1beta1.FetchFileGitStatusesResponse.UncommittedFileChange uncommitted_file_changes = 1;
   * </code>
   */
  int getUncommittedFileChangesCount();
  /**
   *
   *
   * <pre>
   * A list of all files which have uncommitted Git changes. There will only be
   * a single entry for any given file.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1beta1.FetchFileGitStatusesResponse.UncommittedFileChange uncommitted_file_changes = 1;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.dataform.v1beta1.FetchFileGitStatusesResponse
                  .UncommittedFileChangeOrBuilder>
      getUncommittedFileChangesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of all files which have uncommitted Git changes. There will only be
   * a single entry for any given file.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1beta1.FetchFileGitStatusesResponse.UncommittedFileChange uncommitted_file_changes = 1;
   * </code>
   */
  com.google.cloud.dataform.v1beta1.FetchFileGitStatusesResponse.UncommittedFileChangeOrBuilder
      getUncommittedFileChangesOrBuilder(int index);
}
