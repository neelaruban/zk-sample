zk.afterMount(function () {
	zk.Widget.$(jq('$forScript2')[0].id).setValue('changed by script in foo.js');	
});
