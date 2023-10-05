# Git commands

>**Error:** The Current Branch Has No Upstream Branch

It might happen that you are working on your regular day-to-day coding. You create a new branch, 
make some commits and then after doing git push you get this error:
<pre>
  <code>
    # Error: fatal: The current branch **BRANCH-NAME** has no upstream branch.
    # To push the current branch and set the remote as upstream, use
    $ git push --set-upstream origin BRANCH_NAME
  </code>
</pre>
# Solving the this issue

There are many ways to solve issue. One of them would be to just follow the instructions above.
<pre>
  <code>
    $ git config --global push.default current 
    #then
    $ git push
  </code>
</pre>
