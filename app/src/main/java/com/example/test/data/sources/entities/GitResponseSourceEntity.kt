package com.example.test.data.sources.entities

import com.squareup.moshi.Json

data class GitResponseSourceEntity(
    @Json(name = "id") val id: Int,
    @Json(name = "node_id") val nodeId: String?,
    @Json(name = "name") val name: String?,
    @Json(name = "full_name") val fullName: String?,
    @Json(name = "owner") val owner: Owner?,
    @Json(name = "private") val private: Boolean?,
    @Json(name = "htmlUrl") val htmlUrl: String?,
    @Json(name = "description") val description: String?,
    @Json(name = "fork") val fork: Boolean?,
    @Json(name = "url") val url: String?,
    @Json(name = "archive_url") val archiveUrl: String?,
    @Json(name = "assignees_url") val assigneesUrl: String?,
    @Json(name = "blobs_url") val blobsUrl: String?,
    @Json(name = "branches_url") val branchesUrl: String?,
    @Json(name = "collaborators_url") val collaboratorsUrl: String?,
    @Json(name = "comments_url") val commentsUrl: String?,
    @Json(name = "commits_url") val commitsUrl: String?,
    @Json(name = "compare_url") val compareUrl: String?,
    @Json(name = "contents_url") val contentsUrl: String?,
    @Json(name = "contributors_url") val contributorsUrl: String?,
    @Json(name = "deployments_url") val deploymentsUrl: String?,
    @Json(name = "downloads_url") val downloadsUrl: String?,
    @Json(name = "events_url") val eventsUrl: String?,
    @Json(name = "forks_url") val forksUrl: String?,
    @Json(name = "git_commits_url") val gitCommitsUrl: String?,
    @Json(name = "git_refs_url") val gitRefsUrl: String?,
    @Json(name = "git_tags_url") val gitTagsUrl: String?,
    @Json(name = "git_url") val gitUrl: String?,
    @Json(name = "issue_comment_url") val issueCommentUrl: String?,
    @Json(name = "issue_events_url") val issueEventsUrl: String?,
    @Json(name = "issues_url") val issuesUrl: String?,
    @Json(name = "keys_url") val keysUrl: String?,
    @Json(name = "labels_url") val labelsUrl: String?,
    @Json(name = "languages_url") val languagesUrl: String?,
    @Json(name = "merges_url") val mergesUrl: String?,
    @Json(name = "milestones_url") val milestonesUrl: String?,
    @Json(name = "notifications_url") val notificationsUrl: String?,
    @Json(name = "pulls_url") val pullsUrl: String?,
    @Json(name = "releases_url") val releasesUrl: String?,
    @Json(name = "ssh_url") val sshUrl: String?,
    @Json(name = "stargazers_url") val stargazersUrl: String?,
    @Json(name = "statuses_url") val statusesUrl: String?,
    @Json(name = "subscribers_url") val subscribersUrl: String?,
    @Json(name = "subscription_url") val subscriptionUrl: String?,
    @Json(name = "tags_url") val tagsUrl: String?,
    @Json(name = "teams_url") val teamsUrl: String?,
    @Json(name = "trees_url") val treesUrl: String?,
    @Json(name = "clone_url") val cloneUrl: String?,
    @Json(name = "mirror_url") val mirrorUrl: String?,
    @Json(name = "hooks_url") val hooksUrl: String?,
    @Json(name = "svn_url") val svnUrl: String?,
    @Json(name = "homepage") val homepage: String?,
    @Json(name = "language") val language: String?,
    @Json(name = "forks_count") val forksCount: String?,
    @Json(name = "stargazers_count") val stargazersCount: String?,
    @Json(name = "watchers_count") val watchersCount: String?,
    @Json(name = "size") val size: String?,
    @Json(name = "default_branch") val defaultBranch: String?,
    @Json(name = "open_issues_count") val open_issuesCount: String?,
    @Json(name = "is_template") val isTemplate: Boolean?,
    @Json(name = "topics") val topics: List<String?>,
    @Json(name = "has_issues") val hasIssues: Boolean?,
    @Json(name = "has_projects") val hasProjects: Boolean?,
    @Json(name = "has_wiki") val hasWiki: Boolean?,
    @Json(name = "has_pages") val hasPages: Boolean?,
    @Json(name = "has_downloads") val hasDownloads: Boolean?,
    @Json(name = "has_discussions") val hasDiscussions: Boolean?,
    @Json(name = "archived") val archived: Boolean?,
    @Json(name = "disabled") val disabled: Boolean?,
    @Json(name = "visibility") val visibility: String?,
    @Json(name = "pushed_at") val pushedAt: String?,
    @Json(name = "created_at") val createdAt: String?,
    @Json(name = "updated_at") val updatedAt: String?,
    @Json(name = "permissions") val permissions: Permissions?,
    @Json(name = "security_and_analysis") val securityAndAnalysis: SecurityAndAnalysis?,
)


data class Owner(
    @Json(name = "login") val login: String?,
    @Json(name = "id") val id: String?,
    @Json(name = "node_id") val nodeId: String?,
    @Json(name = "avatar_url") val avatarUrl: String?,
    @Json(name = "gravatar_id") val gravatarId: String?,
    @Json(name = "url") val url: String?,
    @Json(name = "html_url") val htmlUrl: String?,
    @Json(name = "followers_url") val followersUrl: String?,
    @Json(name = "following_url") val followingUrl: String?,
    @Json(name = "gists_url") val gistsUrl: String?,
    @Json(name = "starred_url") val starredUrl: String?,
    @Json(name = "subscriptions_url") val subscriptionsUrl: String?,
    @Json(name = "organizations_url") val organizationsUrl: String?,
    @Json(name = "repos_url") val reposUrl: String?,
    @Json(name = "events_url") val eventsUrl: String?,
    @Json(name = "received_events_url") val receivedEventsUrl: String?,
    @Json(name = "type") val type: String?,
    @Json(name = "site_admin") val siteAdmin: Boolean?,
)

data class Permissions(
    @Json(name = "admin") val login: Boolean?,
    @Json(name = "push") val push: Boolean?,
    @Json(name = "pull") val pull: Boolean?,
)

data class SecurityAndAnalysis(
    @Json(name = "advanced_security") val advancedSecurity: AdvancedSecurity?,
    @Json(name = "secret_scanning") val secretScanning: SecretScanning?,
    @Json(name = "secret_scanning_push_protection") val secretScanningPushProtection: SecretScanningPushProtection?,
)

data class AdvancedSecurity(
    @Json(name = "status") val status: String?,
)

data class SecretScanning(
    @Json(name = "status") val status: String?,
)

data class SecretScanningPushProtection(
    @Json(name = "status") val status: String?,
)





